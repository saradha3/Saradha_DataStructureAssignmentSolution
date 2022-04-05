package com.construction.service;

import java.util.PriorityQueue;
import java.util.Stack;

public class Service {
	
	public void calculateOrder(int[] floorsizes,int no_of_floors) {
		
		System.out.println("The order of construction is as follows: ");
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] array = new int[no_of_floors];

		int max = no_of_floors;

		System.out.println();
		for (int i = 0; i < no_of_floors; i++) {

			System.out.println("Day: "+(i+1));
			
			
			array[i] = floorsizes[i];

			queue.add(array[i]);


			while (!queue.isEmpty() && queue.peek() == max) {

				System.out.print(queue.poll() + " ");

				max--;

			}

			System.out.println();

		}

		
	}

}
