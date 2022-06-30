package Questos;

import java.util.Arrays;

import java.util.Scanner;

public class Q1_LP4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite as notas do concurso");
		
		int job [] = new int [10];
		int aux = 0;
		
		for(int k=0; k<job.length;k++)
			job[k]=entrada.nextInt();
		
		
		for(int i=0; i<job.length;i++) {
		
			for(int j=0; j<job.length;j++) {
				if(job[i]<job[j]) {
					aux = job[i];
					job [i] = job[j];
					job[j] = aux;
				}
			}
			
		}
		
		System.out.println("Maior nota: " + job[9]);
		System.out.println("Segunda maior nota: " + job[8]);
		System.out.println("Terceira maior nota: " + job[7]);
		System.out.println("Menor nota: " + job[0]);
		
	}
}
