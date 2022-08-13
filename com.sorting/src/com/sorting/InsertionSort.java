package com.sorting;

import java.util.Scanner;

/* 
T.C:-O(n)best, O(n^2)average, O(n^2)worst
=> Insertion Sort takes n^2/4 comparisons and n^2/8 swaps in average case and in worst case they are double.
=> Insertion Sort is almost linear for partially sorted input.

 */

class SortInsertion{
	static int[] insertionSort(int[] array){
		 int  key;  
		 int size=array.length;
	    for (int i = 1; i <size; i++) {  
	        key = array[i];  
	       int j = i;  
	  
	        while(j>=1 && key < array[j-1])  /* Move the elements greater than temp to one position ahead from their current position*/  
	        {    
	            array[j] = array[j-1];     
	            j--;    
	        }    
	        array[j] = key;    
	    }
			return array;
	}
}

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables and array.
		int size,array[],result[];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array.");
		size=scan.nextInt();
		array=new int[size];
		result=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element of index: "+i);
			array[i]=scan.nextInt();
		}
		
		result=SortInsertion.insertionSort(array);
		for(int i=0;i<size;i++) {
			System.out.print(result[i]+" ");
		}
		scan.close();
	}

}
