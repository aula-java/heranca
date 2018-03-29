package br.edu.ifrs.canoas.java.heranca;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class GerenteTest {

	Gerente gerente;

	@Before
	public void setup() {
		gerente = new Gerente();
	}

	@Test
	public void testNome() {
		gerente.setNome("Rodrigo");
		assertEquals("O nome do cliente eh Rodrigo", "Rodrigo",
				gerente.getNome());
	}

	@Test
	public void testAutenticacao() {
		gerente.setSenha(123456);
		assertTrue("A senha do cliente eh 123456", gerente.autentica(123456));
		assertFalse("A senha do cliente eh 123456", gerente.autentica(654321));
	}
	
}
