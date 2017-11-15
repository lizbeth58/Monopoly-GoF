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
public class Board {
    private Square [] squares;

    public Board() {
        squares = new Square[5];
        
        squares[0] = new GoSquare();
        squares[1] = new RegularSquare();
        squares[2] = new IncomeTaxSquare();
        squares[3] = new GoToJailSquare();
        squares[4] = new JailSquare();
    }
    
    public Square getSquare(Square location, int roll){
        return squares[ (location.getLocation() + roll) % 5 ];
    } 
    public Square setGo(){
        return squares[0];
    }    
}
