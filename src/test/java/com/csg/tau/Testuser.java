package com.csg.tau;

import java.util.Scanner;

import Userinput.Sum1;

public class Testuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum1 obj = new Sum1();
Scanner scn = new Scanner(System.in);
System.out.print("Enter first number");
int x = scn.nextInt();
System.out.print("Enter second number");
int y = scn.nextInt();
obj.sum(x, y);
	}

}
