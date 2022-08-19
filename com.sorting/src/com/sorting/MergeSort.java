package com.sorting;
import java.util.Scanner;

class SortMerge{
	static int[] mergeSort(int [] array){
		int left=0;
		int right=array.length-1; 
//		SortMerge ss=new SortMerge();
//		ss.sortMerge(array,left,right);
		sortMerge(array,left,right);
		return array;
	}
	
	static void sortMerge(int[] array,int left, int right) { 
		if(left<right) {
			int mid=(left+right)/2;
			sortMerge(array, left, mid);
			sortMerge(array, mid+1, right);
		    merge(array,left,right,mid+1); 
		}
//		return array; 
	}
	
	 static void merge(int [] array,int left, int right, int mid) {
		
		int temp[]=new int[array.length];
		int left_end=mid-1;
		int temp_pos=left;
		int size=right-left+1;
		while(left<=left_end && mid<=right) {
			if(array[left]<=array[mid]) {
				temp[temp_pos]=array[left];
				temp_pos++;
				left++;
			}else {
				temp[temp_pos]=array[mid];
				temp_pos++;
				mid++;
			}
		}
		while(left<=left_end) {
			temp[temp_pos]=array[left];
			temp_pos++;
			left++;
		}
		while(mid<=right) {
			temp[temp_pos]=array[mid];
			temp_pos++;
			mid++;
		}
		for(int i=0;i<size;i++) {
			array[right]=temp[right];
			right--;
		}
//		return array;
	}
	
}

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of element in array");
		int size=scan.nextInt();
		int[] array=new int [size];
		int [] result=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element of index: "+i);
			array[i]=scan.nextInt();
		}
		result=SortMerge.mergeSort(array);
		for(int i=0;i<size;i++) {
			System.out.println(result[i]);
		}
		scan.close();
	}

}
