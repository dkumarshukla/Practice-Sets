package com.dks;

import java.util.*;

public class MinimumCost {

	static long minimumCost(int p[], int n) {

		Arrays.sort(p);
		int tCost = 0;
			for (int i = n - 1; i > 1; i -= 2) {
				if (i == 2) {
					tCost += p[2] + p[0];
				} else {
					int pfirst = p[i] + p[0] + 2 * p[1];
					int psecond = p[i] + p[i - 1] + 2 * p[0];
					tCost += Math.min(pfirst, psecond);
				}
			}
			if (n == 1) {
				tCost += p[0];
			} else {
				tCost += p[1];
			}
		
		return tCost;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the no. of people in Village: ");
		int number = s.nextInt();
		int[] p = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the price of Person " + i);
			p[i] = s.nextInt();
		}
		System.out.println(minimumCost(p, number));
	}
}
