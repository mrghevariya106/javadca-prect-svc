package com.wings1.dca;

import java.util.Arrays;
import java.util.Scanner;

public class StockProfit {
	 // Function to find the maximum profit earned by buying and
    // selling shares any number of times
    public static int findMaxProfit(int[] price)
    {
        // keep track of the maximum profit gained
        int profit = 0;
 
        // initialize the local minimum to the first element's index
        int j = 0;
 
        // start from the second element
        for (int i = 1; i < price.length; i++)
        {
            // update the local minimum if a decreasing sequence is found
            if (price[i - 1] > price[i]) {
                j = i;
            }
 
            // sell shares if the current element is the peak,
            // i.e., (`previous <= current > next`)
            if (price[i - 1] <= price[i] &&
                (i + 1 == price.length || price[i] > price[i + 1]))
            {
                profit += (price[i] - price[j]);
                System.out.printf("Buy on day %d and sell on day %d\n", j + 1, i + 1);
            }
        }
 
        return profit;
    }
 
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
//		int M =sc.nextInt();
		int price[] = new int[7];
		System.out.println("Enter price per day: ");
		for(int i=0;i<7;i++) {
			price[i] = sc.nextInt();
		}
		System.out.println("Price per Day: "+Arrays.toString(price));
 
        System.out.print("\nTotal profit earned is " + findMaxProfit(price));
    }
}