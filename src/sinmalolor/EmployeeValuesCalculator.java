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
public class EmployeeValuesCalculator {
    private final float rmu = (float) 386.0;

    
    public float cs(Employee employee){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        return month%2==0?employee.value:employee.value + rmu/12*2;

    }
    public float calculateYearBonus(Employee employee){
        if (employee instanceof Worker)
            return 0;
        return employee.salary + employee.salary * employee.bonusConstant;
    }
}
