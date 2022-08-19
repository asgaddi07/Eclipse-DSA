package com.sorting;
import java.util.Scanner;

class SortQuick{
	static int[] quickSort(int[] array) {
		int low=0;
		int high=array.length -1;
		sortQuick(array, low, high);
		return array;
	}
	
	static void sortQuick(int[] array, int low, int high){
		if(low<high) {
			int pivot=partition(array,low,high);
			sortQuick(array,low,pivot-1);
			sortQuick(array,pivot+1,high);
		}
	}

	static int partition(int [] array, int low, int high) {
		int left=low;
		int right=high;
		int pivot=array[low];
		while(left<right) {
			while(array[left]<=pivot)left++;
			while(array[right]>pivot)right--;
			if(left<right) {
				int temp=array[left];
				array[left]=array[right];
				array[right]=temp;
			}
		}
		array[low]=array[right];
		array[right]=pivot; 
		
		return right;
	}
}

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int array[],result[];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of element in array");
		 size=scan.nextInt();
		 array=new int[size];
		 result=new int[size];
		 for(int i=0;i<size;i++) {
			 System.out.println("Enter element of index: "+i);
			 array[i]=scan.nextInt();
		 }
		 result=SortQuick.quickSort(array);
		 for(int i=0;i<size;i++) {
			 System.out.println(result[i]);
		 }
		 scan.close();
	}

}
