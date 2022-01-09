package com.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AverageOfArrayElementsTest {

	

		@BeforeAll
		static void setUp() {
			System.out.println("@BeforeAll Executed");
		}
		@BeforeEach
		void setUpThis() {
			System.out.println("@BeforeEach Executed");
		}

 //Test Case before implementing case =>TDD
		
		@Test
		void stringAssertions() {
			 Assertions.assertEquals(AverageOfArrayElements.str1, AverageOfArrayElements.str2);
			 
			 Assertions.assertTrue (AverageOfArrayElements.val1 < AverageOfArrayElements.val2);
			 
			 Assertions.assertFalse (AverageOfArrayElements.val1 > AverageOfArrayElements.val2);
			 
			 Assertions.assertNotNull(AverageOfArrayElements.str1);
			 
			 Assertions.assertNull(AverageOfArrayElements.str3);
			 
			 Assertions.assertSame(AverageOfArrayElements.str4,AverageOfArrayElements.str5);
			 
			 Assertions.assertNotSame(AverageOfArrayElements.str1,AverageOfArrayElements.str3);

			 
		}
		@Test
		void calculateTest() {
			//Assertions.fail("No code has been implemented", new Exception());
			System.out.println("Before Implenting the code");
			int x=AverageOfArrayElements.add(12,12);//actual value
			System.out.println("Test is executed");
			Assertions.assertEquals(24, x);
			
			int y=AverageOfArrayElements.substract(12,12);//actual value
			System.out.println("Test is executed");
			Assertions.assertEquals(0, y);
			
			
		
	}
		
}


