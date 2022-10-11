package com.greatlearning.currencyDenomination;
import java.util.Arrays;

public class Sort {
	int [] sort(int arr[]) {
		
		if(arr.length == 1) 
			return arr;
	
		
		int [] sortedArray = new int[arr.length];
		int mid = sortedArray.length/2;
		
		int [] leftArray = new int[arr.length/2];
		int [] rightArray = new int[arr.length - leftArray.length];
		
		
		leftArray = Arrays.copyOfRange(arr, 0, mid);
		leftArray = sort(leftArray);
		
		rightArray = Arrays.copyOfRange(arr, mid, arr.length);
		rightArray = sort(rightArray);
		
		
		return merge(leftArray, rightArray);
	}
	
	int [] merge (int leftArray[], int rightArray[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		int [] resultArray = new int[leftArray.length + rightArray.length];
		
		while(i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] > rightArray[j]) {
				resultArray[k] = leftArray[i];
				i++;
			}
			else {
				resultArray[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		//Add the remaining values
		while (i < leftArray.length) {
			resultArray[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < rightArray.length) {
			resultArray[k] = rightArray[j];
			j++;
			k++;
		}
		return resultArray;
	}

}
