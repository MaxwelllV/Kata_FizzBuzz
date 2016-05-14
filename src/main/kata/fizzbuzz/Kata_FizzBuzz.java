/**
 * 
 */
package main.kata.fizzbuzz;

/**
 * @author ZeuX
 *
 */
public class Kata_FizzBuzz {

	private static String Fizz;
	private static String Buzz;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<=100;i++){
			numerotres(i);
			System.out.println(i);
			
		}
	}
	
	private static String numerotres(int num){
		int dividir = num%3;
		if(dividir == 0){
			return Fizz;
		}
		return null;
	}
	
	private static String numerocinco(int num){
		int dividir = num%5;
		if(dividir == 0){
			return Buzz;
		}
		return null;
	}
}
