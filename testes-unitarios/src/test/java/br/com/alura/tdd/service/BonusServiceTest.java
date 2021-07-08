package br.com.alura.tdd.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	private BonusService bonusService;

	@Test
	void bonusDeveriaserZeroBonusAcima() {
		bonusService = new BonusService();
		assertThrows(IllegalArgumentException.class, 
				() -> bonusService.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
//		try {
//			bonusService.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
//			fail("Falhou a exceção");
//		} catch (Exception e) {
//			assertEquals("Funcionario com salário superior ao planejado.", e.getMessage());
//		}
		
	}
	
	@Test
	void bonusDeveriaserZeroBonusDezPorcento() {
		bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		
		Assert.assertEquals(new BigDecimal("250.0"), bonus);
	}
	
	@Test
	void bonusDeveriaserZeroBonusDezPorcentoLimite() {
		bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
		
		Assert.assertEquals(new BigDecimal("1000.0"), bonus);
	}

}
