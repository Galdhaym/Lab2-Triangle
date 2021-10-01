package com.company;

import java.util.ArrayList;

public class Triangles {
    private final ArrayList<Triangle> triangles;

    Triangles(){
        triangles = new ArrayList<>();
    }

    Triangles(int count){
            triangles = new ArrayList<>(count);
    }

    public void add(Triangle triangle){
        triangles.add(triangle);
    }

    public static void printEqualTriangles(Triangles figures){
        ArrayList<Triangle> triangles = figures.triangles;
        for(int j = 0; j < triangles.size(); j++){
            for(int i = j+1; i < triangles.size(); i++) {

                if(trianglesEqual(triangles.get(i), triangles.get(j))){
                    System.out.println("Equal triangle numbers: "+ i + " and " + j);
                }
            }
        }
    }

    private static boolean trianglesEqual(Triangle triangle1, Triangle triangle2) {
        if(!triangle1.isTriangle() || !triangle2.isTriangle()){
            return false;
        }

        double sideA1 = triangle1.getSide1();
        double sideA2 = triangle1.getSide2();
        double sideA3 = triangle1.getSide3();
        double sideB1 = triangle2.getSide1();
        double sideB2 = triangle2.getSide2();
        double sideB3 = triangle2.getSide3();

        return (Math.abs(sideA1 - sideB1) < 0.1 && Math.abs(sideA2 - sideB2)  < 0.1 && Math.abs(sideA3 - sideB3)  < 0.1);
    }

    public static void printAllTriangleInfo(Triangles figures){
        int i = 1;
        for(Triangle triangle: figures.triangles){
            System.out.println("Triangle"+ i +"\n" + triangle);
            i++;
        }
    }

}
