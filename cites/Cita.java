/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cites;
import java.util.Date;
import vista.FrInicioAlumnos;
import vista.FrCitasRegistradas;
import vista.FrCitasPendientes;
/**
 *
 * @author Angel Garcia Romero, Andres Salvador Barragan Muñoz
 *         Danna del Viento Teran, Diego Soto Flores
 *         Salvador Laguna Bernal
 */

public class Cita {
    
    String id_cita;
    Date fecha;
    Date hora;
    String citadorId;
    String CitadorDocente;
    String motivo;
    String estado;
    
    //constructor
    public Cita(String id_cita,Date fecha, Date hora, String citadorId, String CitadorDocente, String motivo, String estado){
    this.id_cita= id_cita;
    this.fecha = fecha;
    this.hora = hora;
    this.citadorId=citadorId;
    this.CitadorDocente= CitadorDocente;
    this.motivo= motivo;
    this.estado= estado;
    }
    
    //constrcutor vacio
    public Cita(){
    }

    //metodos getters y setters
    public String getId_cita() {
        return id_cita;
    }

    public void setId_cita(String id_cita) {
        this.id_cita = id_cita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getCitadorId() {
        return citadorId;
    }

    public void setCitadorId(String citadorId) {
        this.citadorId = citadorId;
    }

    public String getCitadorDocente() {
        return CitadorDocente;
    }

    public void setCitadorDocente(String CitadorDocente) {
        this.CitadorDocente = CitadorDocente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
