/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;


public class Cliente {
    public String Nombre;
    public String Apellido;
    public String Cedula;  
    private Location location;
    
    public Cliente(String Nombre, String Apellido, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
    public String mostrarLocation(){
        String dir = location.getPais() + " - " + location.getProvincia() + " - " + location.getCiudad();
        return  dir+ "\n" + location.getDireccion();
    }
    
    public void setLocation(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
        location.setPais(nuevoPais);
        location.setCiudad(ciudadnueva);
        location.setProvincia(provinciaNueva);
        location.setDireccion(direccionNueva);
    }
}
