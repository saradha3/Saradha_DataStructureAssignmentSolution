package com.construction.main;

import java.util.Scanner;

import com.construction.service.Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building");
		int no_of_floors = sc.nextInt();
		
		int[] floor_sizes = new int[no_of_floors];
		for(int i=0;i<no_of_floors;i++) {
			System.out.println("Enter the floor size given on day : "+(i+1));
			floor_sizes[i] = sc.nextInt();
		}
		
		Service service = new Service();
		service.calculateOrder(floor_sizes, no_of_floors);
		

	}

}
