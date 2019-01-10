/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sinmalolor;

/**
 *
 * @author OscarPallazhco
 */
public class Location {
    
    private String provincia;
    private String pais;
    private String ciudad;
    private String direccion;

    public Location(String provincia, String pais, String ciudad, String direccion) {
        this.provincia = provincia;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
