/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

import cites.Cita;
import cites.Alumno;
import database.SqlAlumno;
import database.SqlCitas;
import javax.swing.table.DefaultTableModel;
/*
Este es un archivo hecho para probar la base de datos, sientanse
Sientanse libres de cambiar los valores si quieren probar algo en especifico
*/
public class testBD {
  public static void main(String[] args){
    
    probarCitas();
    
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
      
      System.out.println(alumno.toString());
  }
  
  public static void modificarAlumno(){
     //La id que ocupo
    Alumno alumno = new Alumno();
    
    alumno.setId("1");
    
    
     //Lo que quiero cambiar
    alumno.setContrasena("contrasena");
    alumno.setCorreoInstitucional("al22760554@ite.edu.mx");
    alumno.setNombreCompleto("Nombre cambiado");
    alumno.setNumeroControl(6666);
    
    SqlAlumno coneccionBD = new SqlAlumno();
    coneccionBD.modificarAlumno(alumno);
  }
  
  public static void probarCitas(){
      SqlCitas dbCon = new SqlCitas();
      
        //crear objeto citas
      Cita cita = new Cita();
      cita.setAnio(2024);
      cita.setMes(3);
      cita.setDia(27);
      cita.setHora(1040);
      
      cita.setCitadorDocente("000003");
      cita.setCitadorId("000006");
      
      cita.setMotivo("preguntas");
      cita.setEstado("p");
      
      
      
      
      //guardar una cita
      //dbCon.crearCita(cita);
      
      //modificar la cita
      //dbCon.cambiarEstadoCita("1", 'd');
      
      //ver todass las citas
      DefaultTableModel DT = new DefaultTableModel();
      
      DT = dbCon.consultarCitasPorAlumno("1");
      System.out.println(DT);
      
      DT = dbCon.consultarCitasPorCoordinador("1");
      
      System.out.println(DT);
      
  }
}
