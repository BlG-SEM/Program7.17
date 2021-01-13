package ru.vsu.cs.console;

import ru.vsu.cs.logic.Solution;
import ru.vsu.cs.tests.TestSumArrayElements;
import ru.vsu.cs.utils.MyArrayUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        new TestSumArrayElements().runAllTest();

       //int[] arr = MyArrayUtils.generateArr(5, 100);
        int[] arr = MyArrayUtils.readArrayFromKeyboard();
        System.out.println(Arrays.toString(arr));
        System.out.println("Max sum = " + Solution.findMaxSum(arr));
    }
}
