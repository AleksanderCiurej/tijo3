package com.company;


public class Calculations {
    public static Point2D positionGeometricCenter(Point2D[] points){
        double gcX = 0, gcY = 0;

        for(Point2D point : points){
            gcX += point.getX();
            gcY += point.getY();
        }

        return new Point2D(gcX / points.length, gcY / points.length);

    }

    public static Point2D positionCenterOfMass(MaterialPoint2D[] materialPoint){
        double comX = 0, comY = 0, comMass = 0;

        for(MaterialPoint2D point: materialPoint){
            comX += point.getX() * point.getMass();
            comY += point.getY() * point.getMass();
            comMass += point.getMass();
        }

        return new MaterialPoint2D(comX/comMass,comY/comMass,comMass);
    }
}
