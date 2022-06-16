package com.JANA60.fizzbuzz.controller.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in); //inseriamo la possibilità di input da tastiera
		
		int num = 0; // creo una variabile e la assegno subito per evitare errori
		
		do
		{
			
			System.out.println("Insert the maximum number you want to reach playing from 1 up to 200:");//chiediamo di inserire un numero tra 0 e 200
			num= Integer.parseInt(keyboard.nextLine());// la stringa inserita da tastiera diventa un numero che affidiamo alla variabile num
			
			if (num<1 && num>=200) //se l'utente inserisce un numero non compreso tra 1 e 200
				System.out.println("Invalid number: accepted values are between 1 and 200. Try again"); //do a schermo l'errore
			
		}while(num<1 && num>=200);//e si attiva il while, facendo ricominciare il ciclo
			
		//dopo di questo noi sappiamo che l'utente ha per forza inserito un numero tra 1 e 200
		

		for (int i=1; i<=num;i++) //ciclo che parte da 1 e arriva fino al valore deciso dall'utente
		{
			String res=""; //stringa di risultato che esiste solo dentro questo ciclo
			//le variabili inizializzate all'interno di parentesi graffe, quindi dentro un blocco
			//esistono solo dentro quel blocco
			
			if (i%3==0) //se la divisione per 3 mi da resto 0
				res+="fizz "; //al risultato concateno fizz
			if(i%5==0) //se la divisione per 5 da resto 0
				res+="buzz"; //al risultato aggiunge buzz
			//se il numero è prima divisibile per 3 e poi divisibile per 5, a res prima concateno fizz e poi buzz, senza aggiungere altro
			
			if(i%3!=0 && i%5!=0)//se il numero non è divisibile né per 3 né per 5, dammi come risultato solo il numero
				res+=i;
			
			System.out.println(res);//alla fine metto a schermo il risultato
		}
		
		keyboard.close();
	}

}
