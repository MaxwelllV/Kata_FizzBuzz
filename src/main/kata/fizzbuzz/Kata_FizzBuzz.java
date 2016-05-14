/**
 * 
 */
package main.kata.fizzbuzz;

/**
 * @author ZeuX
 *
 */
public class Kata_FizzBuzz {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Metodos_Kata_FizzBuzz mt = new Metodos_Kata_FizzBuzz();
		for(int i=1; i<=100;i++){
			System.out.println(mt.numeros(i));
		}
	}
}
