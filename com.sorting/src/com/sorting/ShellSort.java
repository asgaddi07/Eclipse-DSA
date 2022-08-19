package com.sorting;
import java.util.Scanner;

class SortShell{
	static int[] shellSort(int[] array){
		
		int size=array.length;
		
		for(int gap=size/2; gap>0; gap/=2) {
			for(int i=gap;i<size;i++) {
				int temp=array[i];
				int j;
				for(j=i; j>=gap && array[j-gap]>temp;j-=gap) {
					array[j]=array[j-gap];
				}
				array[j]=temp;
			}
		}
		
		return array;
	}
}

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of element in array.");
		int  size=scan.nextInt();
		int result[]=new int[size];
		int array[]=new int[size];
		for(int i=0;i<size;i++) { 
				System.out.println("Enter element of index: "+i); 
				array[i]=scan.nextInt();
		}
		result=SortShell.shellSort(array);
		for(int i=0;i<size;i++)System.out.println(result[i]+" ");
		scan.close();
	}

}
