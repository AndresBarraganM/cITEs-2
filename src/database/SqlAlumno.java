/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import cites.Alumno;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class SqlAlumno extends SqlConector {
    
    public void crearAlumno(Alumno alumno){
        int numControl = alumno.getNumeroControl(); //Igual a matricula
        String nombreCompleto = alumno.getNombreCompleto();
        String correo = alumno.getCorreoInstitucional();
        String contrasenia = alumno.getContrasena();
        
        
        String sqlInsert= "INSERT INTO Alumnos(nombre, matricula, contrasenia, correo) values (?,?,?,?)";
        //"+nombreCompleto+","+numControl+","+correo+","+contrasenia+"
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlInsert);
            
            
            
            PS.setString(1,nombreCompleto);
            PS.setString(2,String.valueOf(numControl));          
            PS.setString(3,contrasenia);
            PS.setString(4, correo);
            
            int res= PS.executeUpdate();
            if(res>0){
                System.out.println("Alumno Registrado");
            }
        } catch(Exception e){
            System.err.println("Error al crear alumno en bd: "+e.getMessage());
        } finally{
            this.desconectar();
            //this.close();
        }
    }
       
    
    //Devuelve un objeto alumno vacio si no encuentra nada
     public Alumno consultarAlumno (String contrasenia, String correo){
        //Codigo de: https://www.youtube.com/watch?v=dSn4ZORiqpY
        Alumno alumno = new Alumno();
        String sqlSelect = "SELECT * FROM Alumnos WHERE correo = (?) AND contrasenia = (?)";

        
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setString(1,correo);
            PS.setString(2,contrasenia);
            
            //System.out.println(PS);
            RS = PS.executeQuery();
            

            if( !RS.isBeforeFirst()){ //No encontro alumno
                throw new Exception("No alumno encontrado con estas credenciales");
            }
 
            RS.next();
            alumno.setId(String.valueOf(RS.getInt(1)));
            alumno.setNombreCompleto( RS.getString(2));
            alumno.setNumeroControl( Integer.parseInt(RS.getString(3)));
            alumno.setContrasena(RS.getString(4));
            alumno.setCorreoInstitucional(RS.getString(5));
            
        } catch (Exception e){
            if (e.getMessage().equals("No alumno encontrado")){
                System.out.println("No alumno encontrado con estos parametros");
            } else{
                System.err.println("Error al consultar datos de alumno: "+e);
            }
        } finally{
            
            //this.desconectar();
            this.close();
            return alumno;
       }
    }
     
    public Alumno consultarAlumnoPorId (int id){
        //Codigo de: https://www.youtube.com/watch?v=dSn4ZORiqpY
        Alumno alumno = new Alumno();
        String sqlSelect = "SELECT * FROM Alumnos WHERE id_usuario = (?)";
            
        
        try {
            this.conectar();            
            PreparedStatement PS = this.getConnection().prepareStatement(sqlSelect);
            PS.setInt(1,id);
            RS = PS.executeQuery();
            

            if( !RS.isBeforeFirst()){ //No encontro alumno
                throw new Exception("No alumno encontrado con estas credenciales");
            }
 
            RS.next();
            alumno.setId(String.valueOf(RS.getInt(1)));
            alumno.setNombreCompleto( RS.getString(2));
            alumno.setNumeroControl( Integer.parseInt(RS.getString(3)));
            alumno.setContrasena(RS.getString(4));
            alumno.setCorreoInstitucional(RS.getString(5));
            
        } catch (Exception e){
            if (e.getMessage().equals("No alumno encontrado")){
                System.out.println("No alumno encontrado con estos parametros");
            } else{
                System.err.println("Error al consultar datos de alumno: "+e);
            }
        } finally{
            
            //this.desconectar();
            this.close();
            return alumno;
       }
    }
    
    public void modificarAlumno(Alumno alumno){
        //Ocupa un objeto alumno con el que sobre escribir el campo de la base de datos
        //Asegurense de que la id sea la misma para que no falle
        //fuente: https://www.youtube.com/watch?v=UNiYU0NjiQI
        String sqlUpdate= "UPDATE Alumnos SET nombre = (?), matricula = (?), contrasenia = (?), correo = (?) WHERE id_usuario = (?)";
        String nombre = alumno.getNombreCompleto();
        int matricula = alumno.getNumeroControl();
        String contrasenia = alumno.getContrasena();
        String correo = alumno.getCorreoInstitucional();
        String id_usuario = alumno.getId();
        
        
        
        try {
            this.conectar();
            PreparedStatement PS = this.getConnection().prepareStatement(sqlUpdate);
            PS.setString(1,nombre);
            PS.setString(2,String.valueOf(matricula));
            PS.setString(3,contrasenia);
            PS.setString(4,correo);
            PS.setString(5,id_usuario);
            
            PS.execute();
            
        } catch(SQLException e){
            System.out.println("Error al modificar registro de alumno: "+e.getMessage());
        } finally {
            this.desconectar();
            //this.close();
        }
    }
}