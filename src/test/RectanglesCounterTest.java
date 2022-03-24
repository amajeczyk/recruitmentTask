package test;
import org.junit.jupiter.api.Test;
import solution.RectanglesCounter;

import static org.testng.Assert.assertEquals;


class RectanglesCounterTest {

    @Test
    void countRectanglesTest1() {
        boolean [][] arr = {
                {true, true, false, true},
                {true, false, true, true},
                {false, true, false, true},
                {true, false, true, true}
        };
        int expectedOutput = 6;
        assertEquals(expectedOutput, RectanglesCounter.countRectangles(arr));
    }
    @Test
    void countRectanglesTest2() {
        boolean [][] arr = { {true, true}, {true, true}};
        int expectedOutput = 1;
        assertEquals(expectedOutput, RectanglesCounter.countRectangles(arr));
    }
    @Test
    void countRectanglesTest3() {
        boolean [][] arr = {
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},

        };
        int expectedOutput = 18;
        assertEquals(expectedOutput, RectanglesCounter.countRectangles(arr));
    }

    @Test
    void countRectanglesTest4() {
        boolean [][] arr = { {true}, {true}, {true}, {true}};
        int expectedOutput = 0;
        assertEquals(expectedOutput, RectanglesCounter.countRectangles(arr));
    }


}