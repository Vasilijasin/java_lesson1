package ru.qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testArea() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Assert.assertEquals(p1.distance(p2), 2.8284271247461903);

    }
}

