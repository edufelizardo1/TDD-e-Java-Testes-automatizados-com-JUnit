package br.com.alura.tdd.testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Calculadora;

public class CalculadoraTeste {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma(3,7);
		
		Assert.assertEquals(10, soma);
	}

}
