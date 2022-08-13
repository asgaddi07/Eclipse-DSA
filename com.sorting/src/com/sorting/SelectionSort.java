package com.sorting;

import java.util.Scanner;

class SortSelection{
	static int [] selectionSort(int [] array) {
		int size=array.length;
	/*	for(int i=0;i<size-1;i++) {
			int indexMin=i;
			for(int j=i+1;j<size;j++) {
				if(array[indexMin]>array[j])indexMin=j;
			}
			int temp=array[i];
			array[i]=array[indexMin];
			array[indexMin]=temp; 
		}
		*/
		
		//Alternative way store largest element at end
		for(int i=size-1;i>0;i--) {
			int indexMin=i;
			for(int j=i-1;j>=0;j--) {
				if(array[indexMin]<array[j])indexMin=j;
			}
			int temp=array[i];
			array[i]=array[indexMin];
			array[indexMin]=temp; 
		}
		return array;
	}
}

public class SelectionSort {

	public static void main(String[] args) {
		//declare variables and array.
		int size;
		int []array;
		int []result;
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in array.");
		size=scan.nextInt();
		array=new int[size];
		result=new int[size+1];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element of index: "+i);
			array[i]=scan.nextInt();
		}
		
		result=SortSelection.selectionSort(array);
		for(int i=0;i<size;i++)System.out.println(result[i]+" ");
		scan.close();
		
	} 
}
