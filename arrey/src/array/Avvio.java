package array;

import java.sql.Array;
import java.util.Scanner;

public class Avvio 
{
/** Creo l'oggetto Scanner per prendere in imput i numeri .*/
		Scanner sc=new Scanner(System.in);
/** Creo un array da 6 elementi e lo chiamo imput di int.*/
		int []imput =new int[6];
		//int []imput =new int[6];
		
/** Creo un array da 6 elementi e lo chiamo vincite di boolean.*/		
		boolean []vincite =new boolean[6];
/**Creo una variabile compresi da 0 a 90.*/
		int compresi=90;
		
		
		public static void main(String[] args) 
	{
	
		/**Creo il primo ciclo di for per chiedere in imput n 6 numeri compresi da 0 a 90 .*/
			for (int cont=1;cont<=6;cont++) 
			{
			System.out.println("Inserisci un numero compreso tra 1 e 90 ?  ");
			Scanner sc1=new Scanner(System.in);
			int imput=sc1.nextInt();
			
				/** Verifico se il numero inserito e compreso da 1 a 90 */
			if (imput >=1 && imput <=90) 
			{ 
				/**La condizione è vera*/
				System.out.print("HAI inserito un numero giusto    "+imput);
				System.out.println("");
			}
				/**La condizione è falsa*/
			else 
			{
				System.out.println("");
				System.out.print("HAI inserito un numero fuori range ."+imput);
			}
				imput[cont]=imput;
				
			}
			
			
			
			
			
			
			
			
		
	}

}
