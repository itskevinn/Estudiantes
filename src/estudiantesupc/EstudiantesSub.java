/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantesupc;

import java.io.Serializable;

/**
 *
 * @author keiinerp
 */
public class EstudiantesSub extends Estudiante implements Serializable{
    public String beneficiado;
    public double subsidio;

    public String getBeneficiado() {
        return beneficiado;
    }

    public void setBeneficiado(String beneficiado) {
        this.beneficiado = beneficiado;
    }

    public double getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(double subsidio) {
        this.subsidio = subsidio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSisben() {
        return sisben;
    }

    public void setSisben(float sisben) {
        this.sisben = sisben;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
}
