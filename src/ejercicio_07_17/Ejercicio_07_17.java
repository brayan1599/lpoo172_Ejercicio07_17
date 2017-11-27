/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_17;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Ingrese la cantidad de estudiantes: ");
		String[] students = new String[input.nextInt()];
		int[] puntajes = new int[students.length];

		// Prompt the user to enter each students' names and thier scores
		System.out.println("Ingrese el nombre de un puntaje para cada estudiante:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Estudiantes " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Puntajes: ");
			puntajes[i] = input.nextInt();
		}

		// Sort student names in decreasing order of their scores
		sortDecreasing(students, puntajes);

		// Display student name in decreasing order of thier scores
		for (String e: students) {
			System.out.println(e);
		}
	}

	/** sorts a string and integer array in decreasing order */
	public static void sortDecreasing(String[] strs, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int maxIndex = i;
			String temp;

			// Find the minimum in the list[i..nums.length - 1]
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
					maxIndex = j;
				}
			}
			
			if (maxIndex != i) {
				// Swap string array
				temp = strs[i];
				strs[i] = strs[maxIndex];
				strs[maxIndex] = temp;

				// Swap int array
				nums[maxIndex] = nums[i];
				nums[i] = max;
			}
		}
	}
}