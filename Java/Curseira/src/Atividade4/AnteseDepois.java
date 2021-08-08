package Atividade4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

class AnteseDepois {
	
	@After
	public void After() {
		System.out.println("After");		
	}
	
	
	@BeforeClass
	public static void Beforeclass(){
		System.out.println("1");
	}
	
	
	@AfterClass
	public static void AftercClass() {
		System.out.println("AfterClass");				
	}	
	
	@Test
	public void test1() {
		System.out.println("1");
	}
	@Before
	public void Before() {
		System.out.print("Before");
	}
	
	
	
	@Test
	public void test2() {
		System.out.println("2");
	
	}
	@Test
	public void test3() {
		System.out.println("3");
	
	}
}
	
