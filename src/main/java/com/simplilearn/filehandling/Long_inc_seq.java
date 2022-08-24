package com.simplilearn.filehandling;

import java.util.Scanner;

public class Long_inc_seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		int omax=0;
		int[] lis = new int [n];
		for(int i=0; i<lis.length; i++) {
			int max = 0;
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i]) {
					if(lis[j]>max) {
						max=lis[j];
						
					}
				}
			}
			lis[i]=max+1;
			if(lis[i]>omax) {
				omax=lis[i];
			}
		}
		System.out.println(omax);
	}

}

