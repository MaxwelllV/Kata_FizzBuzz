/**
 * 
 */
package test.kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import main.kata.fizzbuzz.Kata_FizzBuzz;

/**
 * @author ZeuX
 *
 */

public class Test_kata_fizzbuzz {

	private Kata_FizzBuzz kfb;
	
	@Before
	public void setUp() throws Exception{
		kfb = new Kata_FizzBuzz();
	}
	@Test
	public void numerosentretres(){
		Kata_FizzBuzz kfb = new Kata_FizzBuzz();
		kfb.add(3);
	}

}
