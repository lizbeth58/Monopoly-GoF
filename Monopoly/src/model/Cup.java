/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author elizabeth
 */
public class Cup { //pure fabrication
    private Dice die1;
    private Dice die2;

    public Cup() {
        die1 = new Dice();
        die2 = new Dice();
    }
   
    public void Roll(){
        die1.roll();
        die2.roll();
    }
    public int getTotal() {
        return (die1.getFaceValue() + die2.getFaceValue());
    }
}
