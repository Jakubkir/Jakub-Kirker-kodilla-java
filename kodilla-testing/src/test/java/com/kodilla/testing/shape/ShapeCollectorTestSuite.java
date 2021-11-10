package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import com.kodilla.testing.shape.ShapeCollector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All tests were finished");
    }

    @Before
    public static void beforeEveryTest() {
        testCounter++;
        System.out.println("This is the " + testCounter + " test");
    }

    @Test
    public void testAddFigure() {
        //Given
        List<Shape> testList = new ArrayList<>();
        testList.add(new Circle(23));
        testList.add(new Triangle(12,18));
        List<Shape> expectedList = new ArrayList<>();
        expectedList.add(new Circle(23));
        expectedList.add(new Triangle(12,18));
        expectedList.add(new Square(12));

        int expectedListSize = expectedListSize.getShapeList().size();
        //When
        testList.addFigure(new Square(12));
        
        int actualListSieze = testList.getShapeList().size();
        //Then
        
        Assert.assertEquals(expectedListSize, actualListSieze);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                new Circle(23),
                new Triangle(12, 18),
                new Square(12))));
        ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                new Circle(23),
                new Triangle(12, 18))));

        int expectedListSize = expectedListSize.getShapeList().size();
        //When
        testList.removeFigure(Square(12));
        int actualListSieze = testList.getShapeList().size();
        //Then
        Assert.assertEquals(expectedListSize, actualListSieze);
    }

    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, triangle, square)));
        //When

        Shape shape1 = testList.getFigure(1);
        Shape shape2 = testList.getFigure(-1);
        Shape shape3 = testList.getFigure(3);

        //Then
        Assert.assertEquals(triangle, shape1);
        Assert.assertEquals(null, shape2);
        Assert.assertEquals(null, shape3);
    }

    @Test
    public void testShowFigures() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, triangle, square)));
        //When

        //Then
        Assert.assertEquals(testList, ShapeCollector.showFigures());
    }
}
