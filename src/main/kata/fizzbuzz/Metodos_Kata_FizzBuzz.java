/**
 * 
 */
package main.kata.fizzbuzz;

/**
 * @author ZeuX
 *
 */
public class Metodos_Kata_FizzBuzz {
	
	/**
	 * This method receives a number as parameter and checks if is multiple of 3, 5 or both.
	 * In case that the number is multiple of 3 or , returns 'Fizz'
	 * In case that the number is multiple of 5, returns 'Buzz'
	 * In case that the number is multiple of 3 and 5, returns 'FizzBuzz'
	 * In case that the number isn't multiple, returns the number
	 * @param num: The given number
	 * @return : 'Fizz' or 'Buzz' or 'FizzBuzz'
	 */

	public String numeros(int num){
		String result = ""+num;
		if(num%3 == 0 && num%5 == 0){
			result = "FizzBuzz";
		}else if(num%5 == 0){
			result = "Buzz";
		}else if(num%3 == 0){
			result = "Fizz";
		}else if(Integer.toString(num).contains("3")){
			result = "Fizz";
		}		
		return result;
	}
}
