package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaserZeroBonusAcima() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
		
		Assert.assertEquals(BigDecimal.ZERO, bonus);
	}
	
	@Test
	void bonusDeveriaserZeroBonusDezPorcento() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		
		Assert.assertEquals(new BigDecimal("250.0"), bonus);
	}
	
	@Test
	void bonusDeveriaserZeroBonusDezPorcentoLimite() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
		
		Assert.assertEquals(new BigDecimal("1000.0"), bonus);
	}

}
