package com.example.learning.learningSpring;

public class longTable implements Table{

    double height;
    double length;

    public longTable(double height, double length){
        this.length=length;
        this.height=height;
    }

    @Override
    public String showDetails(){
        return "this is long table having height "+this.height+" and length "+this.length;
    }
}
