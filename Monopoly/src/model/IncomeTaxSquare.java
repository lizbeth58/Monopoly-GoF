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
public class IncomeTaxSquare extends Square{
    
    public IncomeTaxSquare() {
        super("Income Tax Square",2);
    }

    @Override
    public void landedOn(Player player) {
        System.out.println("Landed on: " + super.getName());
        player.reduceCash( Math.min(200, (player.getNetWorth() * .10) ) );
    }
}
