/**
 * 
 */
package test.kata.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.kata.fizzbuzz.Metodos_Kata_FizzBuzz;

/**
 * @author ZeuX
 *
 */

public class Test_kata_fizzbuzz {

	/**
	 * A variable of Metodos_Kata_FizzBuzz
	 */
	
	private Metodos_Kata_FizzBuzz kfb;
	
	/**
	 * Keep in the variable a new object of Metodos_Kata_FizzBuzz
	 */
	
	@Before
	public void setUp(){
		kfb = new Metodos_Kata_FizzBuzz();
	}
	
	/**
	 * This test checks if the given number for parameter is equals 'Fizz'
	 */
	
	@Test
	public void numerosentretres(){
		String result = kfb.numeros(3);
		assertEquals("Fizz", result);
	}
	
	/**
	 * This test checks if the given number for parameter is equals 'Buzz'
	 */
	
	@Test
	public void numeroscinco(){
		String result = kfb.numeros(5);
		assertEquals("Buzz", result);
	}
	
	/**
	 * This test checks if the given number for parameter is equals 'FizzBuzz'
	 */
	
	@Test
	public void numerostresecinco(){
		String result = kfb.numeros(15);
		assertEquals("FizzBuzz", result);
	}
	
	/**
	 * This test checks if the given number for parameter contains 3 and equals 'Fizz'
	 */
	
	@Test
	public void numerosquecontengantres(){
		String result = kfb.numeros(13);
		assertEquals("Fizz", result);
	}
}
