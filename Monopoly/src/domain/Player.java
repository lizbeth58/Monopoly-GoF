/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import model.Board;
import model.Cup;
import model.Square;


/**
 *
 * @author elizabeth
 */
public class Player {
    private Square location;
    private int cash;
    private Board board;
    private Cup cup;

    public Player() {
        board = new Board();
        cup = new Cup();
        location = board.setGo();
        cash = 1500;
        
        cup.Roll();
        System.out.println("Dice: "+ cup.getTotal());
        
        location = board.getSquare(location, cup.getTotal());
        location.landedOn(this);
        
        System.out.println("Cash: " + cash);
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public int getNetWorth() {
       return cash;
    }

    public void reduceCash(double cash) {
        this.cash -= cash;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
