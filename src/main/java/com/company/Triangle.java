package com.company;

import lombok.*;

public class Triangle {
    @Setter @Getter private Point point1, point2, point3;

    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public boolean isTriangle(){
        double x1 = this.point1.getX();
        double y1 = this.point1.getY();
        double x2 = this.point2.getX();
        double y2 = this.point2.getY();
        double x3 = this.point3.getX();
        double y3 = this.point3.getY();
        return !((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1));
    }

    public double getSide1(){
        if(!isTriangle()) {
            return 0;
        }
        double x1 = this.point1.getX();
        double y1 = this.point1.getY();
        double x2 = this.point2.getX();
        double y2 = this.point2.getY();
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public double getSide2(){
        if(!isTriangle()) {
            return 0;
        }

        double x2 = this.point2.getX();
        double y2 = this.point2.getY();
        double x3 = this.point3.getX();
        double y3 = this.point3.getY();
        return Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
    }

    public double getSide3(){
        if(!isTriangle()) {
            return 0;
        }
        double x1 = this.point1.getX();
        double y1 = this.point1.getY();
        double x3 = this.point3.getX();
        double y3 = this.point3.getY();
        return Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
    }

    public double getAngle1(){
        if(!isTriangle()) {
            return 0;
        }
        double side1 = getSide1();
        double side2 = getSide2();
        double side3 = getSide3();
        return Math.acos((Math.pow(side1, 2) + Math.pow(side3, 2) - Math.pow(side2, 2)) / (2 * side1 * side3)) * 180 / Math.PI;
    }

    public double getAngle2(){
        if(!isTriangle()) {
            return 0;
        }
        double side1 = getSide1();
        double side2 = getSide2();
        double side3 = getSide3();
        return Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2))/(2 * side1 * side2))*180/Math.PI;
    }

    public double getAngle3(){
        if(!isTriangle()) {
            return 0;
        }
        double side1 = getSide1();
        double side2 = getSide2();
        double side3 = getSide3();
        return Math.acos((Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2)) / (2 * side2 * side3)) * 180 / Math.PI;
    }

    public double getPerimeter() {
        if(!isTriangle()) {
            return 0;
        }
        return getSide1() + getSide2() + getSide3();
    }

    public double getArea() {
        if(!isTriangle()) {
            return 0;
        }
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-getSide1())*(semiPerimeter-getSide2())*(semiPerimeter-getSide3()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                "\n point2=" + point2 +
                "\n point3=" + point3 +
                "\n isTriangle=" + isTriangle() +
                "\n Side1=" + Format.floatFormat(getSide1()) +
                "\n Side2=" + Format.floatFormat(getSide2()) +
                "\n Side3=" + Format.floatFormat(getSide3()) +
                "\n Angle1=" + Format.floatFormat(getAngle1()) +
                "\n Angle2=" + Format.floatFormat(getAngle2()) +
                "\n Angle3=" + Format.floatFormat(getAngle3()) +
                "\n Perimeter=" + Format.floatFormat(getPerimeter()) +
                "\n Area=" + Format.floatFormat(getArea()) +
                '}';
    }
}
