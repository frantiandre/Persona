/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persona;

import java.util.Date;

/**
 *
 * @author FRANKLIN
 */

    import java.util.Date;
/**
 *
 * @author FRANKLIN
 * //esta es la modificacion que relize 
 */
public class clspersona {
    
    private int _Id;
    private String _Nombre;
    private String _Direccion;
    private String _Telefono;
    private int _Edad;
    private double _Peso;
    private boolean _Genero;
    private Date _Fecha;
    private float _altura;
    private boolean _Discapacidad;

    public clspersona() {
    }

    public clspersona(int id, String nombre, String direccion, String telefono, int edad, double peso, boolean genero, Date fecha, float altura, boolean discapacidad) {
        this._Id = id;
        this._Nombre = nombre;
        this._Direccion = direccion;
        this._Telefono = telefono;
        this._Edad = edad;
        this._Peso = peso;
        this._Genero = genero;
        this._Fecha = fecha;
        this._altura = altura;
        this._Discapacidad = discapacidad;
    }

    public int Id() {
        return _Id;
    }

    public void Id(int ids) {
        this._Id = ids;
    }

    public String Nombre() {
        return _Nombre;
    }

    public void Nombre(String nombres) {
        this._Nombre = nombres;
    }

    public String Direccion() {
        return _Direccion;
    }

    public void Direccion(String direc) {
        this._Direccion = direc;
    }

    public String Telefono() {
        return _Telefono;
    }

    public void Telefono(String telef) {
        this._Telefono = telef;
    }

    public int Edad() {
        return _Edad;
    }

    public void Edad(int edads) {
        this._Edad = edads;
    }

    public double Peso() {
        return _Peso;
    }

    public void Peso(double pesos) {
        this._Peso = pesos;
    }

    public boolean Genero() {
        return _Genero;
    }

    public void Genero(boolean generos) {
        this._Genero = generos;
    }

    public Date Fecha() {
        return _Fecha;
    }

    public void Fecha(Date fec) {
        this._Fecha = fec;
    }

    public float Altura() {
        return _altura;
    }

    public void Altura(float altu) {
        this._altura = altu;
    }

    public boolean Discapacidad() {
        return _Discapacidad;
    }

    public void Discapacidad(boolean disca) {
        this._Discapacidad = disca;
    }

   
     
}
