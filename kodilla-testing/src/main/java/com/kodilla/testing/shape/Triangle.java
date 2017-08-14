package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideA, sideA) != 0) return false;
        return Double.compare(triangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return getClass().getSimpleName();
    }

    @Override
    public double getSurfaceArea() {
        return 1/2 * sideA * sideB;
    }
}
