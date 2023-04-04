package com.greatlearning.CurrencyDenomination.ui;

//import java.util.Collections;
import java.util.Scanner;

public class CurrencyDenominationDriver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntegerSort sort = new MergeSort();
		System.out.print("Enter size of currency deniminations: ");
		int sizeOfCurrencyDeniminations = in.nextInt();
		int[] currencyDenominations = new int[sizeOfCurrencyDeniminations];
		int[] notesCount = new int[sizeOfCurrencyDeniminations];
		int i = 0;
		System.out.println("Enter currency deniminations: ");
		while(i < sizeOfCurrencyDeniminations)
			currencyDenominations[i++] = (in.nextInt());
			i++;
		i = 0;
		while(i < sizeOfCurrencyDeniminations) {
			notesCount[i] = 0;
			i++;
		}
//		Collections.sort(currencyDenominations, Collections.reverseOrder());
		currencyDenominations = sort.sortArray(currencyDenominations);
		System.out.print("Enter target value: ");
		int target = in.nextInt();
		i = 0;
		int quotient;
		while(target > 0 && i<sizeOfCurrencyDeniminations) {
			quotient = target / currencyDenominations[i];
			target = target % currencyDenominations[i];
			notesCount[i] = quotient;
			i++;
		}
		if(target > 0) {
			System.out.println("Given amount cannot be achieved.");
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be :");			
			
			int currency, count;
			for(int j = 0; j < sizeOfCurrencyDeniminations; j++) {
				currency = currencyDenominations[j];
				count = notesCount[j];
				if(count > 0)
					System.out.println(currency + ":" + count);
			}
		}
		in.close();
	}
	
}
