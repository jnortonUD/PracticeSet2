package base;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}
		static MyInteger var1 = new MyInteger(7);
		
		static MyInteger var2 = new MyInteger(15);
		
		static MyInteger var3 = new MyInteger(8);
		
		static MyInteger var4 = new MyInteger(50);
		
	@Test
	public void testIsEven() {
			boolean expected1 = false;
			boolean actual1 = var1.isEven();
			assertEquals(expected1, actual1);
			
			boolean expected2 = false;
			boolean actual2 = var2.isEven();
			assertEquals(expected2, actual2);
			
			boolean expected3 = true;
			boolean actual3 = var3.isEven();
			assertEquals(expected3, actual3);
			
			boolean expected4 = true;
			boolean actual4 = var4.isEven();
			assertEquals(expected4, actual4);
			}
	@Before
	public void setUpBeforeClass1() throws Exception {
		}
		
		static MyInteger value1 = new MyInteger(1);
		
		static MyInteger value2 = new MyInteger(37);
		
		static MyInteger value3 = new MyInteger(75);
		
		static MyInteger value4 = new MyInteger(6);
		
		@Test
		public void testIsOdd() {
			boolean expected1 = true;
			boolean actual1 = value1.isOdd();
			assertEquals(expected1, actual1);
			
			boolean expected2 = true;
			boolean actual2 = value2.isOdd();
			assertEquals(expected2, actual2);
			
			boolean expected3 = true;
			boolean actual3 = value3.isOdd();
			assertEquals(expected3, actual3);
			
			boolean expected4 = false;
			boolean actual4 = value4.isOdd();
			assertEquals(expected4, actual4);
		}
		@Test
		public void isPrime() {
		
			MyInteger a = new MyInteger(1);
			MyInteger b = new MyInteger(2);
			MyInteger c = new MyInteger(12);
		
			assertTrue(MyInteger.isPrime(a));
			assertTrue(MyInteger.isPrime(b));
			assertFalse(MyInteger.isPrime(c));
		}
		@Test
		public void isEven() {
		
			MyInteger a = new MyInteger(4);
			MyInteger b = new MyInteger(11);
		
			assertTrue(MyInteger.isEven(a));
			assertFalse(MyInteger.isEven(b));
		}
		@Test
		public void isOdd() {
		
			MyInteger a = new MyInteger(3);
			MyInteger b = new MyInteger(8);
		
			assertTrue(MyInteger.isOdd(a));
			assertFalse(MyInteger.isOdd(b));
		}
	public void setUpBeforeClass2() throws Exception {
		}
		
		static MyInteger num1 = new MyInteger(4);
		
		static MyInteger num2 = new MyInteger(13);
		
		static MyInteger num3 = new MyInteger(2);
		
		static MyInteger num4 = new MyInteger(10);
		
		@Test
		public void testIsPrime() {
			boolean expected1 = false;
			boolean actual1 = num1.isPrime();
			assertEquals(expected1, actual1);
			
			boolean expected2 = true;
			boolean actual2 = num2.isPrime();
			assertEquals(expected2, actual2);
			
			boolean expected3 = true;
			boolean actual3 = num3.isPrime();
			assertEquals(expected3, actual3);
			
			boolean expected4 = false;
			boolean actual4 = num4.isPrime();
			assertEquals(expected4, actual4);
		}
}
