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

    public Supervisor(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
        this.value = salary + (bonusPercentage * 0.5F);
        this.bonusConstant = 0.7F;
    }
    
}
