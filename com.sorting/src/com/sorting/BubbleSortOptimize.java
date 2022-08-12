package com.sorting;
import java.util.Scanner;

//create class SortBubbleOptimize
class SortBubbleOptimize{
	//Create method bubbleSortOptimize().
	static int [] bubbleSortOptimize(int [] array) {
		//size of array.
		int size=array.length;
		//declare flag to check array are sorted from particular index.
		boolean flag=true;
		//loop for sort an arrays.
		for(int i=0;i<size && flag==true;i++) {
			flag=false;
			for(int j=0;j<size-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=true;
				}
			}
		} 
		return array;
	}
}

public class BubbleSortOptimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of Scanner class.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		//declare variable for size of an arrays.
		int sizeOfArray=scan.nextInt();
		//declare an array.
		int array[]=new int [sizeOfArray];
		//insert values of an array by taking input from user with the help of for loop.
		for(int i=0;i<sizeOfArray;i++) {
			System.out.println("Enter element of array at index"+i+" :");
			array[i]=scan.nextInt();
		}
		//call the method bubbleSortOptimize.
		int [] result=SortBubbleOptimize.bubbleSortOptimize(array);
		//print the sorted array.
		for(int i=0;i<sizeOfArray;i++) {
			System.out.print(result[i]+" ");
		}
		scan.close();
		
	}

}
