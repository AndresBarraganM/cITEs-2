/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import cites.Coordinador;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class SqlCoordinador extends SqlConector {
    
    public void crearCoordinador(Coordinador coordinador){ //Por areglar
        int numEmpleado = coordinador.getNumeroControl(); //Igual a matricula
        String nombreCompleto = coordinador.getNombreCompleto();
        String correo = coordinador.getCorreoInstitucional();
        String contrasenia = coordinador.getContrasena();
        String cargo = coordinador.getCargo();
        
        //FALTAba CARGO
        String sqlInsert= "INSERT INTO Coordinador (nombre, cargo, numeroEmpleado, correo, contrasenia) values (?,?,?,?,?)";
        //nombre, cargo, matricula, contrasenia, correo
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlInsert);
            PS.setString(1,nombreCompleto);
            PS.setString(2,cargo);
            PS.setString(3,String.valueOf(numEmpleado));
            PS.setString(4,correo);
            PS.setString(5, contrasenia);
            
            int res= PS.executeUpdate();
            if(res>0){
                System.out.println("Coordinador Registrado");
            }
        } catch(SQLException e){
            System.err.println("Error al crear coordinador en bd: "+e.getMessage());
        } finally{
            this.desconectar();
            //this.close();
        }
    }
    
    public Coordinador consultarCoordinador(String contrasenia, String numEmpleado){ //por areglar
        //Codigo de: https://www.youtube.com/watch?v=dSn4ZORiqpY
        Coordinador coordinador = new Coordinador();
        String sqlSelect = "SELECT * FROM Coordinador WHERE numeroEmpleado = (?) AND contrasenia = (?)";

        
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setString(1,numEmpleado);
            PS.setString(2,contrasenia);
            RS = PS.executeQuery();
           
            if( !RS.isBeforeFirst()){
                throw new Exception("No coordinador encotnrado con estas credenciales");
            }
            
            RS.next();
            coordinador.setId(String.valueOf(RS.getInt(1)));  //No creo necesario cambiar la id
            coordinador.setNombreCompleto(RS.getString(2));
            coordinador.setCargo(RS.getString(3));
            coordinador.setCorreoInstitucional(RS.getString(4));
            coordinador.setNumeroControl(Integer.parseInt(RS.getString(5)));
            coordinador.setContrasena(RS.getString(6));
            
            
        } catch(Exception e){
            if (e.getMessage().equals("No alumno encontrado")){
                System.out.println("No alumno encontrado con estos parametros");
            } else{
                System.err.println("Error al consultar datos de coordinador: "+e);
            }
        } finally{
            //this.desconectar();
            this.close();
        }
        return coordinador;
    }
    
    public Coordinador consultarCoordinadorPorId(String idCoordinador){ //por areglar
        //Codigo de: https://www.youtube.com/watch?v=dSn4ZORiqpY
        Coordinador coordinador = new Coordinador();
        String sqlSelect = "SELECT * FROM Coordinador WHERE id_coordinador = (?)";

        
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setString(1,idCoordinador);
            RS = PS.executeQuery();
           
            if( !RS.isBeforeFirst()){
                throw new Exception("No coordinador encotnrado con estas credenciales");
            }
            
            RS.next();
            coordinador.setId(String.valueOf(RS.getInt(1)));  //No creo necesario cambiar la id
            coordinador.setNombreCompleto(RS.getString(2));
            coordinador.setCargo(RS.getString(3));
            coordinador.setCorreoInstitucional(RS.getString(4));
            coordinador.setNumeroControl(Integer.parseInt(RS.getString(5)));
            coordinador.setContrasena(RS.getString(6));
            
            
        } catch(Exception e){
            if (e.getMessage().equals("No alumno encontrado")){
                System.out.println("No alumno encontrado con estos parametros");
            } else{
                System.err.println("Error al consultar datos de coordinador: "+e);
            }
        } finally{
            //this.desconectar();
            this.close();
            return coordinador;
        }
    }
    
    public ArrayList<String> mirarOpcionesCoordinacion(){
        String sqlSelect = "SELECT id_coordinador,nombre,cargo FROM Coordinador;";
        
        ArrayList<String>  salida = new ArrayList<String>();
        
        
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            RS = PS.executeQuery();
           
            if( !RS.isBeforeFirst()){
                throw new Exception("No coordinador encotnrado con estas credenciales");
            }
            
            //Pasar a objeto salida
            salida.add("----------------------");
            while(RS.next()){
                salida.add(
                 RS.getString(1) //ID
                        +"-"+
                 RS.getString(2) //Nombre
                         +"-"+
                 RS.getString(3) //Cargo
                );
            }
            
        } catch(Exception e){
            if (e.getMessage().equals("No alumno encontrado")){
                System.out.println("No se encontro ningun coordinador en la base de datos");
            } else{
                System.err.println("Error al consultar  de cdatos especificos de oordinador: "+e);
            }
        } finally{
            //this.desconectar();
            this.close();
        }
        
        return salida;
    }
    
    
    public void modificarCoordinador(Coordinador coordinador){ 
        //Ocupa un objeto coordinador con el que sobre escribir el campo de la base de datos
        //fuente: https://www.youtube.com/watch?v=UNiYU0NjiQI
        String sqlUpdate= "UPDATE Coordinador SET nombre = (?), cargo = (?), numeroEmpleado = (?), contrasenia = (?), correo = (?) WHERE id_coordinador = (?)";
        String nombre = coordinador.getNombreCompleto();
        String cargo = coordinador.getCargo();
        int matricula = coordinador.getNumeroControl();
        String contrasenia = coordinador.getContrasena();
        String correo = coordinador.getCorreoInstitucional();
        String id_usuario = coordinador.getId();
        
        
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlUpdate);
            PS.setString(1,nombre);
            PS.setString(2,cargo);
            PS.setString(3,String.valueOf(matricula));
            PS.setString(4,contrasenia);
            PS.setString(5,correo);
            PS.setString(6, id_usuario);
            
            PS.execute();
            
        } catch(SQLException e){
            System.out.println("Error al modificar registro de coordinador: "+e.getMessage());
        } finally {
            this.desconectar();
            //this.close();
        }
    }
}
