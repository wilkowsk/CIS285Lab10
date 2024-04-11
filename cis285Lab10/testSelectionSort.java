package cis285Lab10;

/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class testSelectionSort {
	SelectionSort sel;
	
	@Before
	public void beforeAll() {
		sel = new SelectionSort();
	}
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public testSelectionSort() {
	}
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		/** add tests to check for this unit test **/
		checkSel(arr, Sortedarr);
	}
	
	public void testNegative(){
		int[] arr = new int[6];
		arr[0] = -10;
		arr[1] = -1;
		arr[2] = -620;
		arr[3] = -3;
		arr[4] = -33;
		arr[5] = -147;
		
		int[] Sortedarr = new int[6];
		Sortedarr[0] = -620;
		Sortedarr[1] = -147;
		Sortedarr[2] = -33;
		Sortedarr[3] = -10;
		Sortedarr[4] = -3;
		Sortedarr[5] = -1;
		/** add tests to check for this unit test **/
		checkSel(arr, Sortedarr);
	}
	public void testMixed(){
		int[] arr = new int[7];
		arr[0] = 0;
		arr[1] = 3;
		arr[2] = -1;
		arr[3] = 2;
		arr[4] = -2;
		arr[5] = 1;
		arr[6] = -3;
		
		int[] Sortedarr = new int[7];
		Sortedarr[0] = -3;
		Sortedarr[1] = -2;
		Sortedarr[2] = -1;
		Sortedarr[3] = 0;
		Sortedarr[4] = 1;
		Sortedarr[5] = 2;
		Sortedarr[5] = 3;
		/** add tests to check for this unit test **/
		checkSel(arr, Sortedarr);
	}
	public void testDuplicates(){
		/** Test data contains duplicates **/
		int[] arr = new int[9];
		arr[0] = -1;
		arr[1] = 1;
		arr[2] = -1;
		arr[3] = -1;
		arr[4] = 1;
		arr[5] = -1;
		arr[6] = 1;
		arr[7] = 0;
		arr[8] = 0;
		
		int[] Sortedarr = new int[9];
		Sortedarr[0] = -1;
		Sortedarr[1] = -1;
		Sortedarr[2] = -1;
		Sortedarr[3] = -1;
		Sortedarr[4] = 0;
		Sortedarr[5] = 0;
		Sortedarr[6] = 1;
		Sortedarr[7] = 1;
		Sortedarr[8] = 1;
		/** add tests to check for this unit test **/
		checkSel(arr, Sortedarr);
	}
	
	private void checkSel(int[] arr, int[] sortedarr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int[] outputArr = sel.basicSelectionSort(arr);
		
		System.out.print("Expected: ");
		for (int i = 0; i < sortedarr.length; i++) {
			System.out.print(sortedarr[i] + " ");
		}
		System.out.println();
		
		System.out.print("Actual: ");
		for (int i = 0; i < outputArr.length; i++) {
			System.out.print(outputArr[i] + " ");
		}
		System.out.println();
		
		assertArrayEquals(outputArr, sortedarr);
	}
}