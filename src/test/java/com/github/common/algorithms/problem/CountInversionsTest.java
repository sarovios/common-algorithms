package com.github.common.algorithms.problem;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CountInversionsTest {

    private CountInversions countInversions;

    @Test
    public void testBruteForceCountInversions() {
        int[] array = {1, 4, 8, 5, 3, 6, 9, 2};
        countInversions = new CountInversions(array);
        countInversions.bruteForce();
        assertEquals(11, countInversions.getInversions());
    }

    @Test
    public void testRecursiveCountInversions() {
        int[] array = {1, 4, 8, 5, 3, 6, 9, 2};
        countInversions = new CountInversions(array);
        countInversions.recursive(0, array.length-1);
        assertEquals(11, countInversions.getInversions());
    }

    @Test
    public void testBruteForceCountInversionsLargeArray() {
        int[] array = new int[100000];
        int i = 0;
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("largeArray.txt").getFile());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                int val =  scanner.nextInt();
                array[i++] = val;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        countInversions = new CountInversions(array);
        countInversions.bruteForce();
        assertEquals(2407905288L, countInversions.getInversions());
    }

    @Test
    public void testRecursiveCountInversionsLargeArray() {
        int[] array = new int[100000];
        int i = 0;
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("largeArray.txt").getFile());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                int val =  scanner.nextInt();
                array[i++] = val;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        countInversions = new CountInversions(array);
        countInversions.recursive(0, array.length-1);
        assertEquals(2407905288L, countInversions.getInversions());
    }
}
