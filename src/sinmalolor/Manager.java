/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;


/**
 *
 * @author Patricio
 */
public class Manager extends Employee{

    public Manager(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
        this.value = salary + (bonusPercentage * 0.7F);
        this.bonusConstant = 1.0F;
    }

}
