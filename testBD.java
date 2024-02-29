/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */


import cites.Alumno;
import database.SqlAlumno;

/*
Este es un archivo hecho para probar la base de datos, sientanse
Sientanse libres de cambiar los valores si quieren probar algo en especifico
*/
public class testBD {
  public static void main(String[] args){
    //crearAlumno();
    //modificarAlumno();
    consultarAlumno();
    
  }
  
  
  public static void crearAlumno(){
     Alumno alumno = new Alumno();
    alumno.setContrasena("myPassword");
    alumno.setCorreoInstitucional("al22760555@ite.edu.mx");
    //alumno.setId("11111"); Autocreada
    alumno.setNombreCompleto("Danny");
    alumno.setNumeroControl(22760555);

    SqlAlumno conectBD = new SqlAlumno();
    conectBD.crearAlumno(alumno);
  }
  
  public static void consultarAlumno(){
      String contrasena = "myPassword";
      String correo = "al22760555@ite.edu.mx";
      
      SqlAlumno conectBD = new SqlAlumno();
      Alumno alumno = conectBD.consultarAlumno(contrasena, correo);
      
      System.out.println(alumno);
  }
  
  public static void modificarAlumno(){
     //La id que ocupo
    Alumno alumno = new Alumno();
    alumno.setId("0000000003");
    
    
     //Lo que quiero cambiar
    alumno.setContrasena("contrasena");
    alumno.setCorreoInstitucional("al22760554@ite.edu.mx");
    alumno.setNombreCompleto("Nombre cambiado");
    alumno.setNumeroControl(6666);
    
    SqlAlumno coneccionBD = new SqlAlumno();
    coneccionBD.modificarAlumno(alumno);
  }
}
