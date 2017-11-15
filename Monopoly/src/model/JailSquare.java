package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Player;

/**
 *
 * @author elizabeth
 */
public class JailSquare extends Square {

    public JailSquare() {
        super("Jail Square",4);
    }

    @Override
    public void landedOn(Player player) {
        System.out.println("Landed on: " + super.getName());
    }
    
}
