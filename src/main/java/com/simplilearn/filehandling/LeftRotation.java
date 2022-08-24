package com.simplilearn.filehandling;

public class LeftRotation {
	void rotateLeft(int arr[],int d,int n) {
		int temp[] = new int[d];
		for(int i=0; i<d; i++) {
			temp[i] = arr[i];
			
		}
		for(int i=d;i<n;i++) {
			arr[i-d]= arr[i];
			
		}
		for(int i = 0; i<d; i++) {
			arr[i+n-d]=temp[i];
		}
	}
	void printarray(int arr[], int n) {
		for(int i=0; i<n; i++)
		System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		LeftRotation rotation = new LeftRotation();
		rotation.rotateLeft(arr, 2, arr.length);
		rotation.printarray(arr, arr.length);
		
	}

}
