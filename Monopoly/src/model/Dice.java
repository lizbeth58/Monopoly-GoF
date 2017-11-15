/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Random;

/**
 *
 * @author elizabeth
 */
public class Dice {
    private int faceValue;
    private Random dice;

    public Dice() {
        faceValue = -1;
        dice = new Random();
    }
    
    public void roll(){
        faceValue = dice.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
