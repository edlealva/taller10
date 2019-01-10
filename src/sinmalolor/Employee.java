/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;




/**
 *
 * @author CltControl
 */


public abstract class Employee
{   
    //salario del employee
    protected float salary;
    //porcentaje de bonus
    protected float bonusPercentage;    
    //variable de tipo employeeType
    protected float value;
    protected float bonusConstant;

    public Employee(float salary, float bonusPercentage) {
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }
    
    

}
