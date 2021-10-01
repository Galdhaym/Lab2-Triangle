package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Triangles triangles = new Triangles();

        Map<Integer, Triangle> mapTriangles = new HashMap<>();
        mapTriangles.put(0, new Triangle(new Point(0.5, 0), new Point(0, 0.5), new Point(0.683, 0.683)));
        mapTriangles.put(1, new Triangle(new Point(1, 1), new Point(2, 2), new Point(2, 1)));
        mapTriangles.put(2, new Triangle(new Point(0, 0), new Point(1, 1), new Point(1, 0)));
        mapTriangles.put(3, new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 3)));
        mapTriangles.put(4, new Triangle(new Point(0.5, 0), new Point(0, 0.5), new Point(0.683, 0.683)));

            for(int i = 0; i < mapTriangles.size(); i++) {
                triangles.add(mapTriangles.get(i));
            }

            System.out.println("All info about triangles: ");
            Triangles.printAllTriangleInfo(triangles);
            Triangles.printEqualTriangles(triangles);

        EqualSideTriangles equalSideTriangles = new EqualSideTriangles();

        Map<Integer, EqualSideTriangle> mapEqualSideTriangles = new HashMap<>();
        mapEqualSideTriangles.put(0, new EqualSideTriangle(new Point(0.5, 0), new Point(0, 0.5), new Point(0.683, 0.683)));
        mapEqualSideTriangles.put(1, new EqualSideTriangle(new Point(0.5, 0), new Point(0, 0.5), new Point(0.683, 0.683)));

        for(int i = 0; i < mapEqualSideTriangles.size(); i++) {
            equalSideTriangles.add(mapEqualSideTriangles.get(i));
        }

        System.out.println("Minimum mediane length of all triangles: ");
        EqualSideTriangles.printEqualSideTrianglesWithMinMediane(equalSideTriangles);
    }
}
