package ES1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Class2 {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		Set<String> duplicate = new HashSet<String>();
		Set<String> uniche = new HashSet<String>();
		Scanner c = new Scanner(System.in);
		
		System.out.println("inserire numero di parole da visualizzare");
		String input = c.nextLine();
		int n = Integer.valueOf(input);
		//////////////
		
		
		
		
		for(int j = 1; j <= n ; j++) {
			
			System.out.println("aggiungi parola");
			String parola = c.nextLine();
			boolean aggiunto = s.add(parola);
			
			if(aggiunto == false) {
				
				duplicate.add(parola);
				
			}
		}
		
		
		//////////////
		
		
		for(String x : duplicate) {
			System.out.println(x);
			
		}
		
		//System.out.println(duplicate);
		//System.out.println(s);
		
		for(String x : s) {
			boolean contenuto = contiene(x, duplicate);
			//System.out.println(contenuto);
			if(contenuto == false) {
				uniche.add(x);
				
			}
		}
		
		System.out.println(uniche.size());
		System.out.println(uniche);
	
	}

	static boolean contiene(String a, Set<String> arr) {
		for(String x : arr) {
			//System.out.println(x);
			//System.out.println(a);
			if(x.equals(a)) {
				System.out.println("true");
				return true;
			}
		}
		return false;
	}
	
}
/*
 * chiedere all'utente numero di parole da inserire -> Scanner, NextLine(-> int)-> integer.valueOf('string') 
 * inserire una parola in base al numero inserito -> NextLine, add()
 * visualizzare 3 output:
 * 1. parole duplicate
 * 2. il nummero di parole distinte
 * 3. parole distinte
 */