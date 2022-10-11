package com.greatlearning.currencyDenomination;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		
		int denominationSize  = sc.nextInt();
		int [] count = new int[denominationSize];
		
		System.out.println("enter the currency denominations value");
		
		int [] value_array = new int [denominationSize];
		
		for(int i = 0; i < denominationSize; i++) {
			value_array[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int requiredAmount = sc.nextInt();
		
		// array sort
		Sort sort = new Sort();
		value_array = sort.sort(value_array);
		
		for(int i = 0; i < denominationSize; i++) {
			
			if (requiredAmount >= value_array[i]) {
				count[i] = requiredAmount/value_array[i];
				requiredAmount = requiredAmount - count[i]*value_array[i];
			}
			
		}
		if(requiredAmount == 0) {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < denominationSize; i++) {
				if(count[i] > 0) {
					System.out.println(value_array[i] + " : "+ count[i]);
				}
			}
		}
		else {
			System.out.println("Amount cannot be printed with the given denominations");
		}
		
	}
}
