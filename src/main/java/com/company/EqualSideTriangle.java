package com.company;

import java.awt.*;

public class EqualSideTriangle extends Triangle{
    EqualSideTriangle(Point point1, Point point2, Point point3) {
        super(point1, point2, point3);
        if(!isEqualSideTriangle()){
            throw new Error("This triangle has not equal sides!");
        }
    }

    public boolean isEqualSideTriangle(){
        return isTriangle()
                && Math.abs(getSide1() - getSide2()) < 0.1
                && Math.abs(getSide2() - getSide3()) < 0.1
                && Math.abs(getSide1() - getSide3()) < 0.1;
    }

    public double getMediane(){
        return Math.sqrt(Math.pow(getSide1(), 2) - Math.pow(getSide2() / 2, 2));
    }
}
