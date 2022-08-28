package com.example.zad5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangularTriangleTest {

    @Test

    void shouldCheckRectangularTriangle(){
        boolean resultTriangle = RectangularTriangle.getCheckRectangularTriangle(6,8,10);
        Assertions.assertEquals(true,resultTriangle);

    }
}
