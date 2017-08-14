package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Square sq = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addShape(sq);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Square sq = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        boolean result = shapeCollector.removeShape(sq);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Square sq = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(sq);

        //When
        boolean result = shapeCollector.removeShape(sq);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Square sq = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(sq);

        //When
        Shape retrievedShape = shapeCollector.getShape(0);

        //Then
        Assert.assertEquals(sq, retrievedShape);
    }
}
