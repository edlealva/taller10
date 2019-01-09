/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Patricio
 */
public class Supervisor extends Employee{

    @Override
    float cs() {
                Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        float valueS = salary + (bonusPercentage * 0.5F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
        return month%2==0?valueS:valueS + rmu/12*2;
    }

    @Override
    float calculateYearBonus() {
        
        return salary + salary * 0.7F;
    }
    

    
}
