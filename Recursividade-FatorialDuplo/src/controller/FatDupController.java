package controller;

public class FatDupController {
	
	public int FatDup (int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * FatDup(n - 2);
		}
	}
	
}
