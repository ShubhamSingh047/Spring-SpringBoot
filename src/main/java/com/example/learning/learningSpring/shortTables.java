package com.example.learning.learningSpring;

public class shortTables implements Table{

    double height;
    double length;

    public shortTables(double height, double length){
        this.height=height;
        this.length=length;
    }

    @Override
    public String showDetails(){
        return "this table is sort having Height "+this.height+" and length "+this.length;
    }
}
