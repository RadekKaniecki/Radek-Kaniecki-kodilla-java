package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeShape(Shape shape) {
        if(shapeList.contains(shape)) {
            shapeList.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getShape(int n) {
        if(n >= 0 && n < shapeList.size()) {
            return shapeList.get(n);
        }
        return null;
    }

    public int getShapesQuantity() {
        return shapeList.size();
    }
}
