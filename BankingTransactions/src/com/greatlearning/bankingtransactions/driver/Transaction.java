package com.greatlearning.bankingtransactions.driver;

import java.util.Scanner;

public class Transaction {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of transaction array");
		
		int noOfTransactions = sc.nextInt();
		
		System.out.println("enter the values of array");
		
		int [] transactionsArray = new int [noOfTransactions];
		
		for (int i = 0; i < noOfTransactions ; i++) {
			transactionsArray[i] = sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		
		int target = sc.nextInt();
		
		//Core logic to check target
		int targetCheck = 0;
		int counter = 0;
		boolean flag = false;
		
		for (int i = 0; i<transactionsArray.length; i++) {
			targetCheck += transactionsArray[i];
			counter += 1;
			if (targetCheck >= target) {
				flag = true;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println("Target achieved after " + counter +  " transactions");
		}else {
			System.out.println("Given target is not achieved");
		}
		
	}

}
