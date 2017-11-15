/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domain.Player;




/**
 *
 * @author elizabeth
 */
public class GoToJailSquare extends Square{
    private JailSquare jail;
    
    public GoToJailSquare() {
        super("Go To Jail Square",3);
        jail = new JailSquare();
    }

    @Override
    public void landedOn(Player player) {
        System.out.println("Landed on: " + super.getName());
        player.setLocation(jail);
    }
    
}
