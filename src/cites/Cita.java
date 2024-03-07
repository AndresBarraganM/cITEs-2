/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cites;
import java.util.Date;

/**
 *
 * @author Angel Garcia Romero, Andres Salvador Barragan Muñoz
 *         Danna del Viento Teran, Diego Soto Flores
 *         Salvador Laguna Bernal
 */

public class Cita {
    
    String id_cita;
    int anio;
    int mes;
    int dia;
    
    int hora; 
    //Esta en hora militar ej. 8:30 es 830
    String citadorId;
    String CitadorDocente;
    String motivo;
    String estado;
    
    //constructor
    public Cita(String id_cita, int anio, int mes, int dia, int hora, String citadorId, String CitadorDocente, String motivo, String estado){
    this.id_cita= id_cita;
    this.hora = hora;
    this.anio = anio;
    this.mes = mes;
    this.dia = dia;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
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

    @Override
    public String toString() {
        return "Cita{" + "id_cita=" + id_cita + ", anio=" + anio + ", mes=" + mes + ", dia=" + dia + ", hora=" + hora + ", citadorId=" + citadorId + ", CitadorDocente=" + CitadorDocente + ", motivo=" + motivo + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
