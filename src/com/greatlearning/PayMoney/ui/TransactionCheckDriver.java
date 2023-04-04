package com.greatlearning.PayMoney.ui;

import java.util.Scanner;

public class TransactionCheckDriver {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of transaction array: ");
		int sizeOfArray = in.nextInt();	
		int[] transactionsArray = new int[sizeOfArray];
		System.out.print("Enter elements in array: ");
		int i = 0;
		while(i < sizeOfArray)
			transactionsArray[i++] = in.nextInt();
		System.out.print("Enter size of targets array: ");
		int sizeOfTargets = in.nextInt();
		int target;
		i = 0;
		while(i < sizeOfTargets) {
			System.out.print("Enter target value #"+(i+1)+" : ");
			target = in.nextInt();
			int result = checkTarget(target, transactionsArray);			
			if(result == -1) {
				System.out.println("Given target is not achievable.");	
			}else {
				System.out.println("Target achieved after "+result+" transactions");
			}
			i++;
		}
		in.close();		
	}
	
	private static int checkTarget(int target, int[] transactionsArray) {
		int sum = 0;
		for(int j = 0; j < transactionsArray.length; j++) {
			sum += transactionsArray[j];
			if(sum >= target) {
				return j+1;
			}
		}
		return -1;		
	}

}
