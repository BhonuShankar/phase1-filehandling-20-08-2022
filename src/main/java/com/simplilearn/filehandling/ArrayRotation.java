package com.simplilearn.filehandling;

public class ArrayRotation {
	
	void rotateArray(int arr[], int n, int d) {
		while(d>n) {
			d=n-d;
		}
		int temp[] = new int[n-d];
		for(int i=0; i<n-d; i++) {
			temp[i]=arr[i];
			
		}
		for(int i=n-d; i<n; i++) {
			arr[i-n+d]=arr[i];
		}
		for(int i=0; i<n-d;i++) {
			arr[i+d]=temp[i];
		}
		
		
	}
	void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
 
            // Printing elements of an array
            System.out.print(arr[i] + " ");
    }
	

	public static void main(String[] args) {
		ArrayRotation rotation = new ArrayRotation();
		

		int arr[] = {1,2,3,4,5};
		rotation.rotateArray(arr, arr.length, 2);
        rotation.printArray(arr, arr.length);

		
	}

}
