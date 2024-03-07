/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import cites.Cita;
import cites.Coordinador;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Usuario
 */

public class SqlCitas extends SqlConector { //TODO Por probar
    
    private DefaultTableModel DT;
    
    private DefaultTableModel setTable(){
        DT = new DefaultTableModel();
        DT.addColumn("idCitas");
        DT.addColumn("citadorID");
        DT.addColumn("coordinadorID");
        DT.addColumn("hora");
        DT.addColumn("motivo");
        DT.addColumn("anio");
        DT.addColumn("estado");
        DT.addColumn("dia");
        DT.addColumn("mes");
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
                    this.DT = setTable();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlInsert);
            
            PS.setString(1, citadorId);
            PS.setString(2, citadorDocente);
            PS.setInt(3,hora);
            PS.setString(4,motivo);
            PS.setInt(5,anio);
            PS.setString(6, estado);
            PS.setInt(7, dia);
            PS.setInt(8,mes);
            
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
        
        try{
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setString(1,idAlumno);
            this.DT = setTable();
            
            RS = PS.executeQuery();
            
            if(!RS.isBeforeFirst()){
                throw new Exception("No cita encontrada");
            }
            
            Object[] fila = new Object[9];
            while(RS.next()){
                fila[0] = RS.getInt(1);
                fila[1] = RS.getInt(2);
                fila[2] = RS.getInt(3);
                fila[3] = RS.getInt(4);
                fila[4] = RS.getString(5);
                fila[5] = RS.getInt(6);
                fila[6] = RS.getString(7);
                fila[7] = RS.getInt(8);
                fila[8] = RS.getInt(9);
                DT.addRow(fila);
            }
        } catch(Exception e){
            if (e.getMessage().equals("No cita encontrada")){
                System.out.println("No cita encontrada ocn estos parametros");
            } else{
                System.err.println("Error al consultar citas: "+e);
            } 
        }finally{
            this.close();               
        }
        return DT;
    } 
    
     public DefaultTableModel consultarCitasPorCoordinador(String idCoordinador){
        //Codigo de: https://www.youtube.com/watch?v=dSn4ZORiqpY
        Cita citaCoord= new Cita();
        String sqlSelect = "SELECT * FROM Citas WHERE coordinadorID = (?)";
        
        try{
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setString(1,idCoordinador);
            this.DT = setTable();
            
            RS = PS.executeQuery();
            
            if(!RS.isBeforeFirst()){
                throw new Exception("No cita encontrada");
            }
            
            Object[] fila = new Object[9];
            while(RS.next()){
                fila[0] = RS.getInt(1);
                fila[1] = RS.getInt(2);
                fila[2] = RS.getInt(3);
                fila[3] = RS.getInt(4);
                fila[4] = RS.getString(5);
                fila[5] = RS.getInt(6);
                fila[6] = RS.getString(7);
                fila[7] = RS.getInt(8);
                fila[8] = RS.getInt(9);
                DT.addRow(fila);
            }
        } catch(Exception e){
            if (e.getMessage().equals("No cita encontrada")){
                System.out.println("No cita encontrada ocn estos parametros");
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
        Cita citaCoord= new Cita();
        String sqlSelect = "SELECT * FROM Citas WHERE coordinadorID = (?) AND estado = (?)";
        
        try{
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setString(1,idCoordinador);
            PS.setString(2,String.valueOf(estado));
            this.DT = setTable();
            
            RS = PS.executeQuery();
            
            if(!RS.isBeforeFirst()){
                throw new Exception("No cita encontrada");
            }
            
            Object[] fila = new Object[9];
            while(RS.next()){
                fila[0] = RS.getInt(1);
                fila[1] = RS.getInt(2);
                fila[2] = RS.getInt(3);
                fila[3] = RS.getInt(4);
                fila[4] = RS.getString(5);
                fila[5] = RS.getInt(6);
                fila[6] = RS.getString(7);
                fila[7] = RS.getInt(8);
                fila[8] = RS.getInt(9);
                DT.addRow(fila);
            }
        } catch(Exception e){
            if (e.getMessage().equals("No cita encontrada")){
                System.out.println("No cita encontrada ocn estos parametros");
            } else{
                System.err.println("Error al consultar citas: "+e);
            } 
        }finally{
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
