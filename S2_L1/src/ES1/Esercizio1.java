package ES1;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

	
	public static void main (String[] args) {
		int[] arr = creaArray();
		printArray(arr);
		inputUtente(arr);
		
	}
	private static int[] creaArray() {
		int[] a = new int [5];
		Random randomGenerator =new Random();
		randomGenerator.nextInt();
		for(int i = 0; i<a.length; i++) {
			a[i] = randomGenerator.nextInt(11);
		}
		return a;
	}
	private static void printArray(int[]a) {
		for(int i = 0; i< a.length; i ++) {
			System.out.println("-" + a[i]);
		}
	}
	private static void inputUtente(int[] arr) {
		Scanner s = new Scanner(System.in);
		int pos, val;
		boolean end = false;
		do {
			System.out.println("inserire la posizione da 1 a 5");
			pos= s.nextInt();
			System.out.println("inserire il valore");
			val= s.nextInt();
			if(pos == 0) {
				end = false;
			} else{
				try {arr[pos - 1]= val;
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println(e);
				e.printStackTrace();
				}
			}
		}while(end);
	}
}