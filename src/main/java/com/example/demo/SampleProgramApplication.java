package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleProgramApplication {
	public static void main(String[] args) {
		int num;
		int nt;
		System.out.print("Enter number of tables.. ");
		Scanner scan = new Scanner(System.in);
		nt = scan.nextInt();
		for (int cnt = 1; cnt < nt; ++cnt) {
//			System.out.println(" cnt.. "+cnt);
			System.out.print("Enter any number: ");
			Scanner scans = new Scanner(System.in);
			num = scans.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
			/*
			 * for (int i = 10; i >= 1; i--) { System.out.println(num + " * " + i + " = " +
			 * num * i); }
			 */ }
	}
	
}
