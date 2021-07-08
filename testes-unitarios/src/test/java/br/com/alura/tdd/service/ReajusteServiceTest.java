package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	@Test
	public void reajusteADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.0"));
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		Assert.assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}
	
	@Test
	public void reajusteBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.0"));
		
		service.concederReajuste(funcionario, Desempenho.BOM);
		
		Assert.assertEquals(new BigDecimal("1150.00"),funcionario.getSalario());
	}
	
	@Test
	public void reajusteOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.0"));
		
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		
		Assert.assertEquals(new BigDecimal("1200.00"),funcionario.getSalario());
	}

}
