package Atividade8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Teste {
	Avi�odeguerra A;
	
	@Before
	public void testPartindo() {
		A = new Avi�o("B-14", 250, 1000);
	}
	
	@Test
	public void testDecolando() {
		A.Acelerar();
		assertEquals(0,A.getVelocidade());
	}
	
	@Test
	public void tesVoado() {
		A.Acelerar();
		assertEquals(300,A.getVelocidade());
		
	}
	
	@Test
	public void testAteri�ando(){
		A.Acelerar();
		A.Desacelerar();
		assertEquals(100, A.getVelocidade());
		
	}
	
	@Test
	public void testPotencia() {
		
	}

}
