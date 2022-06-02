/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Maximiliano Gonzalez
 */
public class Tratamiento {
    int idTratamiento;
    String descripcion;
    Consulta consulta;
    double importe;
    String tipoTratamiento;
    boolean activo;

    public Tratamiento(int idTratamiento, String descripcion, Consulta consulta, double importe, String tipoTratamiento, boolean activo) {
        this.idTratamiento = idTratamiento;
        this.descripcion = descripcion;
        this.consulta = consulta;
        this.importe = importe;
        this.tipoTratamiento = tipoTratamiento;
        this.activo = activo;
    }

    public Tratamiento(String descripcion, Consulta consulta, double importe, String tipoTratamiento, boolean activo) {
        this.descripcion = descripcion;
        this.consulta = consulta;
        this.importe = importe;
        this.tipoTratamiento = tipoTratamiento;
        this.activo = activo;
    }

    public Tratamiento() {
    }

    public int getId_tratamiento() {
        return idTratamiento;
    }

    public void setId_tratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setconsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipo_tratamiento() {
        return tipoTratamiento;
    }

    public void setTipo_tratamiento(String tipo_tratamiento) {
        this.tipoTratamiento = tipo_tratamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "id_tratamiento=" + idTratamiento + ", descripcion=" + descripcion + ", consulta=" + consulta + ", importe=" + importe + ", tipo_tratamiento=" + tipoTratamiento + ", activo=" + activo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.consulta);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.importe) ^ (Double.doubleToLongBits(this.importe) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.tipoTratamiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tratamiento other = (Tratamiento) obj;
        if (Double.doubleToLongBits(this.importe) != Double.doubleToLongBits(other.importe)) {
            return false;
        }
        if (!Objects.equals(this.tipoTratamiento, other.tipoTratamiento)) {
            return false;
        }
        if (!Objects.equals(this.consulta, other.consulta)) {
            return false;
        }
        return true;
    }
    
    
    
}
