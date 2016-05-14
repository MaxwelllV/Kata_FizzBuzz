/**
 * 
 */
package main.kata.fizzbuzz;

/**
 * @author ZeuX
 *
 */
public class Metodos_Kata_FizzBuzz {

	public String numerotres(int num){
		int dividir = num%3;
		String result = "";
		if(dividir == 0){
			result = "Fizz";
		}
		return result;
	}

	public String numerocinco(int num){
		int dividir = num%5;
		String result = "";
		if(dividir == 0){
			result = "Buzz";
		}
		return result;
	}
}
