/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TestFunc;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import Function.LinearSearch;
/**
 *
 * @author HP
 */
public class LinearSearchTest {
    
    public LinearSearchTest() {
    }
  
    @Test
    public void testLinearSeachDuplicateResult() {
        int[] arr1 = {1, 2, 3, 2, 6};
        int search = 2;
        LinearSearch linearSearch = new LinearSearch(arr1);
        ArrayList<Integer> result = linearSearch.search(search);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3));
        assertEquals(expected, result);
    }
    @Test
    public void testLinearSeachSingleResult() {
        int[] arr = {1, 2, 3, 4, 5};
        int search = 3;
        LinearSearch linearSearch = new LinearSearch(arr);
        ArrayList<Integer> result = linearSearch.search(search);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2));
        assertEquals(expected, result);
    }
   @Test
    public void testLinearSeachNotResult() {
        int[] arr = {1, 2, 3, 4, 5};
        int search = 6;
        LinearSearch linearSearch = new LinearSearch(arr);
        ArrayList<Integer> result = linearSearch.search(search);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
    @Test
    public void testLinearSeachEmpty() {
        int[] arr = {};
        int search = 6;
        LinearSearch linearSearch = new LinearSearch(arr);
        ArrayList<Integer> result = linearSearch.search(search);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
    
    @Test
    public void testLinearSeachHaveNull() {
        int[] arr = null;
        int search = 3;
        LinearSearch linearSearch = new LinearSearch(arr);
        ArrayList<Integer> result = linearSearch.search(search);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
    @Test
public void testLinearSearchFirstOccurrence() {
    int[] arr = {1, 2, 3, 4, 5};
    int search = 1;
    LinearSearch linearSearch = new LinearSearch(arr);
    ArrayList<Integer> result = linearSearch.search(search);
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));
    assertEquals(expected, result);
}

@Test
public void testLinearSearchLastOccurrence() {
    int[] arr = {1, 2, 3, 4, 5, 3};
    int search = 3;
    LinearSearch linearSearch = new LinearSearch(arr);
    ArrayList<Integer> result = linearSearch.search(search);
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 5));
    assertEquals(expected, result);
}
}