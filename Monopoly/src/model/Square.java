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
public abstract class Square { //polymorphism
    private String name;
    private int location;

    protected Square(String name, int location) {
        this.name = name;
        this.location = location;
    }

    protected String getName() {
        return name;
    }

    protected int getLocation() {
        return location;
    }
    
    public abstract void landedOn(Player player);
}
