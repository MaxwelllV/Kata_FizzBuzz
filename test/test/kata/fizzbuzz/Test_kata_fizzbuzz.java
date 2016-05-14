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

	private Metodos_Kata_FizzBuzz kfb;
	
	@Before
	public void setUp() throws Exception{
		kfb = new Metodos_Kata_FizzBuzz();
	}
	@Test
	public void numerosentretres(){
		String result = kfb.numerotres(3);
		assertEquals("Fizz", result);
	}

}
