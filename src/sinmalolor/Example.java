/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import conmalolor.*;
import java.util.List;




public class Example {
    
    public List<Cliente> clientes;
    
    
    public void MostrarInformacion(Cliente cliente){
        this.validarInformacion(cliente.Nombre, cliente.Apellido, cliente.Cedula);
        System.out.println("Nombre: " + cliente.Nombre + ", Apellido: " + cliente.Apellido + ", con numero de cedula: " + cliente.Cedula );
        
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        this.validarInformacion(Nombre, Apellido, Cedula);
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + "ha sido agregado como nuevo cliente");
        
    }
    
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        if(checkName(Nombre)){
            System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");
            
        }
        if(checkName(Apellido)){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");
            
        }
        if(!checkCI(Cedula)){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");
            
        }
        
    }
    
    private boolean checkName(String data){
        return "".equals(data)&&data.length()>16;
    }
    private boolean checkCI(String ci){
        
        return "".equals(ci)&&ci.length()<10;
    }
}
