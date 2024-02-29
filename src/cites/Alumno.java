/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cites;

/**
 *
 * @author Angel Garcia Romero, Andres Salvador Barragan Muñoz
 *         Danna del Viento Teran, Diego Soto Flores
 *         Salvador Laguna Bernal
 */
public class Alumno {
    
//atributos de nuestra clase:
    int numeroControl;
    String nombreCompleto;
    String correoInstitucional;
    String contrasena;
    String id;
    //constructor
    public Alumno(int numeroControl,String nombreCompleto,  String correoInstitucional,String contraseña, String id ){
        this.numeroControl= numeroControl;
        this.nombreCompleto= nombreCompleto;
        this.correoInstitucional= correoInstitucional;
        this.contrasena= contrasena;
        this.id=  id;
    }
    
    //constructor vacio
    public Alumno(){
        
    }
    
    //metodos getters y setters

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(int numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  
    
}
