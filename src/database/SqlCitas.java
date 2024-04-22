/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import cites.Alumno;
import cites.Cita;
import cites.Coordinador;
import static java.lang.Math.round;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Usuario
 */

public class SqlCitas extends SqlConector { //TODO Por probar
    
    private DefaultTableModel DT;
    
    public DefaultTableModel setTableForAlumno(){
        DT = new DefaultTableModel();
        DT.addColumn("Nombre del coordinador");
        DT.addColumn("ID_Cita");
        DT.addColumn("Coordinacion"); // Nombre del coordinador
        DT.addColumn("Estado");
        DT.addColumn("Motivo");
        
        DT.addColumn("Hora"); //se cambiara de HHMM a HH:MM
        
        DT.addColumn("Fecha"); //Mezcla de dia, mes y anio
        return DT;
    }
    
    public DefaultTableModel setTableForCoordinador(){
        DT = new DefaultTableModel();
        DT.addColumn("Nombre del Alumno");
        DT.addColumn("ID. Cita");
        DT.addColumn("Estado");
        DT.addColumn("Motivo");
        DT.addColumn("Fecha");
        DT.addColumn("Hora");
        
        return DT;
    }

    public DefaultTableModel setTableForCoordinadorPendiente(){
        DT = new DefaultTableModel();
        DT.addColumn("Nombre del Alumno");
        DT.addColumn("ID. Cita");
        DT.addColumn("Motivo");
        DT.addColumn("Carrera");
        DT.addColumn("Hora");
        
        return DT;
    }
    
    public void crearCita(Cita cita){ 
        //Obtener datos
        //String id = cita.getId_cita();
        int anio = cita.getAnio();
        int mes = cita.getMes();
        int dia = cita.getDia();
        
        int hora = cita.getHora();
        
        String citadorId = cita.getCitadorId();
        String citadorDocente = cita.getCitadorDocente();
        String motivo = cita.getMotivo();
        String estado = cita.getEstado();
        
        String sqlInsert= "INSERT INTO citas"
                + "(citadorID, coordinadorID, hora, motivo, anio, estado, dia, mes)"
                + "values (?,?,?,?,?,?,?,?)";
        
        
        try{
            this.conectar();
                    this.DT = this.setTableForAlumno();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlInsert);
            
            PS.setString(1, citadorId);
            PS.setString(2, citadorDocente);
            PS.setInt(3,hora);
            PS.setString(4,motivo);
            PS.setString(5,estado);
            PS.setInt(6, dia);
            PS.setInt(7, mes);
            PS.setInt(8,anio);
            
            PS.executeUpdate();
            
        } catch(Exception e){
            System.err.println("Error al crear cita en BD: "+ e.getMessage());
        } finally{
                this.desconectar();
        }
    }


    
    public DefaultTableModel consultarCitasPorAlumno(String idAlumno){
        //Codigo de: https://www.youtube.com/watch?v=dSn4ZORiqpY
        Cita citaAlumno = new Cita();
        String sqlSelect = "SELECT * FROM Citas WHERE citadorID = (?)";
        String motivo = "";
                    
        //Variables que usare
        int horaSinFormato = 0;
        String horaFormateada = "";

        int dia = 0;
        int mes = 0;
        int anio = 0;

        String fechaParseada ="";
            
        SqlCoordinador DbCoord = new SqlCoordinador();
        Coordinador cord = new Coordinador();
            
        int coordinadorID = 0;
        
        try{
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setInt(1,Integer.parseInt(idAlumno));
            DefaultTableModel DT = this.setTableForAlumno();
            
            RS = PS.executeQuery();
            
            if(!RS.isBeforeFirst()){
                throw new Exception("No cita encontrada");
            }

            
            //Pasar a la tabla
            Object[] fila = new Object[9];
            while(RS.next()){
                    // Obtener info del coordinador
                    
                coordinadorID = RS.getInt(2);
               
                cord = DbCoord.consultarCoordinadorPorId(String.valueOf(coordinadorID));
                
                //Cambiar formatos de hora y fecha
                
                motivo = RS.getString(5);
            String estado = RS.getString(7);
            String estadoMostrado = "";

            // Asignar estado mostrado según el valor del estado recuperado
            switch (estado) {
                case "p":
                    estadoMostrado = "pendiente";
                    break;
                case "c":
                    estadoMostrado = "confirmada";
                    break;
                case "d":
                    estadoMostrado = "denegada";
                    break;
                default:
                    estadoMostrado = estado; // Otros estados se muestran como están
                    break;
            }
                
                horaSinFormato = RS.getInt(4);
                String horaSinFormatoStr = String.format("%04d", horaSinFormato);
                horaFormateada = String.format("%s:%s",
                                                horaSinFormatoStr.substring(0, 2),  // Las primeras dos cifras son las horas
                                                horaSinFormatoStr.substring(2));  

                dia = RS.getInt(8);
                mes = RS.getInt(9);
                anio = RS.getInt(6);

                fechaParseada = String.valueOf(dia)
                        +"/"+ String.valueOf(mes)
                        +"/"+ String.valueOf(anio);
                
                //Poner en la tabla
                fila[0] = cord.getNombreCompleto(); //Nombre del coordinador
                fila[1] = RS.getInt(1); //ID de la cita
                
                fila[2] = cord.getCargo(); //cargo del coordinador
                fila[3] = estadoMostrado; //Estado
                
                fila[4] = motivo; //Motivo
                
                fila[5] = horaFormateada; //Hora
                
                fila[6] = fechaParseada; //Fecha
                DT.addRow(fila);
            }
            
            
        } catch(Exception e){
            if (e.getMessage().equals("No cita encontrada")){
                System.out.println("No cita encontrada con estos parametros");
            } else{
                System.err.println("Error al consultar citas: "+e);
            } 
        }finally{
            this.close();               
        }
        return DT;
    } 
    

     public DefaultTableModel consultarCitasPorCoordinador(String idCoordinador, char estado){
        //Codigo de: https://www.youtube.com/watch?v=dSn4ZORiqpY
        Cita citaCoord= new Cita();
        String sqlSelect = "SELECT * FROM Citas WHERE coordinadorID = ? AND estado = 'p'";
        
        SqlAlumno alumnCon = new SqlAlumno();
        Alumno alumn;
        
        String nombre = "";
        String motivo = "";

        int horaMilitar = 0;
        String horaFormateada = "";
        
        int dia = 0;
        int mes = 0;
        int anio = 0;
        
        String fechaFormateada = "";
        
        try{
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setString(1,idCoordinador);
            this.DT = setTableForCoordinadorPendiente();
            
            RS = PS.executeQuery();
            
            if(!RS.isBeforeFirst()){
                throw new Exception("No cita encontrada");
            }
            
            Object[] fila = new Object[9];
            while(RS.next()){
                //Obtener datos de alumno relacionado
                alumn = alumnCon.consultarAlumnoPorId(3);
                
                nombre = alumn.getNombreCompleto();
                
                motivo = RS.getString(5);
                
                horaMilitar = RS.getInt(4);
                
                String horaMilitarStr = String.format("%04d", horaMilitar);

                horaFormateada = String.format("%s:%s",
                        horaMilitarStr.substring(0, 2),  // Las primeras dos cifras son las horas
                        horaMilitarStr.substring(2));  


                dia = RS.getInt(8);
                mes = RS.getInt(9);
                anio = RS.getInt(6);

                fechaFormateada = String.valueOf(dia)
                        +"/"+ String.valueOf(mes)
                        +"/"+ String.valueOf(anio);
                
                //Asigran la variable
                fila[0] = nombre; // Nombre
                fila[1] = RS.getInt(1); // Id.Cita
                fila[2] = motivo; //Motivo
                fila[3] = fechaFormateada; //Fecha
                fila[4] = horaFormateada; //Hora
       
                DT.addRow(fila);
            }
        } catch(Exception e){
            if (e.getMessage().equals("No cita encontrada")){
                System.out.println("No cita encontrada con estos parametros");
            } else{
                System.err.println("Error al consultar citas: "+e);
            } 
        }finally{
            this.close();               
        }
        return DT;
    } 
     
    public DefaultTableModel consultarCitasPorCoordinadorAceptadas(String idCoordinador, char estado){
        //Codigo de: https://www.youtube.com/watch?v=dSn4ZORiqpY
        String sqlSelect = "SELECT * FROM Citas WHERE coordinadorID = ? AND estado = ?";
        SqlAlumno alumnCon = new SqlAlumno();
        Alumno alumn;        
        String nombre = "";
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setString(1, idCoordinador);
            PS.setString(2, String.valueOf(estado));
            this.DT = setTableForCoordinador();

            RS = PS.executeQuery();

            if (!RS.isBeforeFirst()) {
                throw new Exception("No se encontraron citas");
            }

            Object[] fila = new Object[9];
            while (RS.next()) {
                // Formateo de la hora
                int horaMilitar = RS.getInt(4);
                alumn = alumnCon.consultarAlumnoPorId(3);
                nombre = alumn.getNombreCompleto();
                String horaMilitarStr = String.format("%04d", horaMilitar);
                String horaFormateada = String.format("%s:%s",
                        horaMilitarStr.substring(0, 2), // Las primeras dos cifras son las horas
                        horaMilitarStr.substring(2));    // Las últimas dos son los minutos

                // Formateo de la fecha
                int dia = RS.getInt(8);
                int mes = RS.getInt(9);
                int anio = RS.getInt(6);
                String fechaFormateada = String.format("%02d/%02d/%d", dia, mes, anio);

                fila[0] = nombre;     // nombre del alumno
                fila[1] = RS.getInt(1);     // Id.Cita
                fila[2] = RS.getString(7);  // Estado
                fila[3] = RS.getString(5);  // Motivo
                fila[4] = fechaFormateada;  // Fecha formateada
                fila[5] = horaFormateada;   // Hora formateada
                DT.addRow(fila);
            }
        } catch (Exception e) {
            if (e.getMessage().equals("No se encontraron citas")) {
                System.out.println("No se encontraron citas con estos parámetros");
            } else {
                System.err.println("Error al consultar citas: " + e);
            }
        } finally {
            this.close();               
        }
        return DT;
    } 
     
    public void cambiarEstadoCita(String idCita, char estadoNuevo){
        //TODO Revisar que si esten asi la tabla citas
        String sqlUpdate= "UPDATE Citas SET estado = (?) WHERE idCitas = (?)";
        
        try{
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlUpdate);
            PS.setString(1, String.valueOf(estadoNuevo));
            PS.setString(2, idCita);
            
            PS.execute();
        } catch (SQLException e){
            System.out.println("Error al modificar registro de cita: "+e.getMessage());
        } finally {
            this.desconectar();
            //this.close();
        }
    }
}
