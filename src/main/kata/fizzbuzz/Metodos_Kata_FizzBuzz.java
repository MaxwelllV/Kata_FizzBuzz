/**
 * 
 */
package main.kata.fizzbuzz;

/**
 * @author ZeuX
 *
 */
public class Metodos_Kata_FizzBuzz {

	public String numeros(int num){
		String result = ""+num;
		if(num%3 == 0 && num%5 == 0){
			result = "FizzBuzz";
		}else if(num%5 == 0){
			result = "Buzz";
		}else if(num%3 == 0){
			result = "Fizz";
		}
		return result;
	}
}
