package com.sorting;

import java.util.Scanner;

//create SortBubble class.
class SortBubble{
	//create bulbbleSort methods.
	  static int [] bubbleSort(int [] array) { 
		int size=array.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		} 
		return array; 
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of Scanner class to take inputs from user.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int sizeOfArray=scan.nextInt();
		//declare a Array.
		int array[]=new int [sizeOfArray];
		//take input from user to fill the array by help of for loop.
		for(int i=0;i<sizeOfArray;i++) {
			System.out.println("Enter elements of index "+i+" :");
			array[i]=scan.nextInt();
		}
		/*
		 If the method is not Static then we call the method by creating the object of a class.
		 Sort object1=new Sort();
		 int result[]=object1.bubbleSort(array);
		 */
		
		//call the method bubbleSort().
		int []result=SortBubble.bubbleSort(array);
		for(int i=0;i<sizeOfArray;i++)System.out.println(result[i]);
		scan.close();
	}

}
