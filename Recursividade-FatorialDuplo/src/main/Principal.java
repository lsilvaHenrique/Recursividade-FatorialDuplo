package main;

import controller.FatDupController;

public class Principal {
	public static void main (String args[]) {
		FatDupController fatdup = new FatDupController();
		int x = fatdup.FatDup(5);
		System.out.println(x);
	}
}
