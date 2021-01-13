package ru.vsu.cs.tests;

import ru.vsu.cs.logic.Solution;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSumArrayElements {

    public void runAllTest(){
        testGetSumOfElements1();
        testGetSumOfElements2();
        testGetSumOfElements3();
        testGetSumOfElements4();
        testGetSumOfElements5();
        testGetSumOfElements6();
        testGetSumOfElements7();
        testGetSumOfElements8();
        testGetSumOfElements9();
        testGetSumOfElements10();
    }

    @Test
    public void testGetSumOfElements1() {
        int actual = Solution.findMaxSum(new int[]{16, 90, 62, 67, 44});
        assertEquals(279, actual);
    }

    @Test
    public void testGetSumOfElements2() {
        int actual2 = Solution.findMaxSum(new int[]{-7, 21, -54, 6, -97});
        assertEquals(21, actual2);
    }

    @Test
    public void testGetSumOfElements3() {
        int actual3 = Solution.findMaxSum(new int[]{72, 71, 45, -58, -71});
        assertEquals(188, actual3);
    }

    @Test
    public void testGetSumOfElements4() {
        int actual4 = Solution.findMaxSum(new int[]{-23, -13, -1, -87, 20});
        assertEquals(20, actual4);
    }

    @Test
    public void testGetSumOfElements5() {
        int actual5 = Solution.findMaxSum(new int[]{3, 73, 57, 32, 88});
        assertEquals(253, actual5);
    }

    @Test
    public void testGetSumOfElements6() {
        int actual6 = Solution.findMaxSum(new int[]{20, 9, -68, 42, 13});
        assertEquals(55, actual6);
    }

    @Test
    public void testGetSumOfElements7() {
        int actual7 = Solution.findMaxSum(new int[]{-49, 12, 93, -38, 19});
        assertEquals(105, actual7);
    }

    @Test
    public void testGetSumOfElements8() {
        int actual8 = Solution.findMaxSum(new int[]{14, 43, 80, -36, 78});
        assertEquals(179, actual8);
    }

    @Test
    public void testGetSumOfElements9() {
        int actual9 = Solution.findMaxSum(new int[]{40, -10, 66, -88, 71});
        assertEquals(96, actual9);
    }

    @Test
    public void testGetSumOfElements10() {
        int actual10 = Solution.findMaxSum(new int[]{-89, 17, 9, 81, 84});
        assertEquals(191, actual10);
    }
}
