/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guillermoespinal_lab8;

/**
 *
 * @author admin
 */
//. Los contactos tienen nombre, edad, número telefónico, correo electrónico y dirección.
public class Contacto {
    private  String nombre;
    private int edad;
    private  String numero ;
    private String correo;
    private String dirrecion;

    public Contacto() {
    }

    public Contacto(String nombre, int edad, String numero, String correo, String dirrecion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
        this.correo = correo;
        this.dirrecion = dirrecion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    @Override
    public String toString() {
        return nombre;//"Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", numero=" + numero + ", correo=" + correo + ", dirrecion=" + dirrecion + '}';
    }
    
    
    
}
