package com.company;

import java.util.ArrayList;

public class EqualSideTriangles {
    private final ArrayList<EqualSideTriangle> triangles;

    EqualSideTriangles(){
        triangles = new ArrayList<>();
    }

    EqualSideTriangles(int count){
        triangles = new ArrayList<>(count);
    }

    public void add(EqualSideTriangle triangle){
        triangles.add(triangle);
    }

    public static void printEqualSideTrianglesWithMinMediane(EqualSideTriangles figures){
        ArrayList<EqualSideTriangle> triangles = figures.triangles;

        double min = triangles.get(0).getMediane();
        int minIndex = 0;
        for(int i = 1; i < triangles.size(); i++){
            double nextMediane = triangles.get(i).getMediane();
            if(min > nextMediane){
                min = nextMediane;
                minIndex = i;
            }
        }
        System.out.println(Format.floatFormat(triangles.get(minIndex).getMediane()));
    }

}
