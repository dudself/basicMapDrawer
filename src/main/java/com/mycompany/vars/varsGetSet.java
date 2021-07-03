/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vars;

import java.util.ArrayList;

/**
 *
 * @author did
 */
//define variables and getter-setter methods
public class varsGetSet {

    public ArrayList<Integer> polyX = new ArrayList<>();
    public ArrayList<Integer> polyY = new ArrayList<>();

    public ArrayList<Integer> getPolyX() {
        return polyX;
    }

    public void setPolyX(ArrayList<Integer> polyX) {
        this.polyX = polyX;
    }

    public ArrayList<Integer> getPolyY() {
        return polyY;
    }

    public void setPolyY(ArrayList<Integer> polyY) {
        this.polyY = polyY;
    }
    
    
    
}
