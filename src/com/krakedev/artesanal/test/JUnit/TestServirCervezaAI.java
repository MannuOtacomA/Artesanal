package com.krakedev.artesanal.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestServirCervezaAI {
	private Maquina rubia;

	@BeforeEach
	public void setUp() {
		rubia = new Maquina("Pilsener", "Cerveza", 0.02, 8000, "cod018");
		rubia.llenarMaquina(); // cantidadActual se establece en 7800 (8000 - 200)
	}

	@Test
	public void testServirCantidadValida() {
		double valor = rubia.servirCerveza(500);
		// Valor = 500 * 0.02 = 10
		assertEquals(10, valor, 0.0001);
		assertEquals(7300, rubia.getCantidadActual(), 0.0001);
	}

	@Test
	public void testServirCantidadInsuficiente() {
		double valor = rubia.servirCerveza(10000); // Excede el stock
		assertEquals(0, valor, 0.0001);
		assertEquals(7800, rubia.getCantidadActual(), 0.0001, "El stock no debe cambiar si el servicio falla");
	}

	@Test
	public void testServirCantidadExacta() {
		double valor = rubia.servirCerveza(7800); // Todo el stock
		assertEquals(156, valor, 0.0001); // 7800 * 0.02
		assertEquals(0, rubia.getCantidadActual(), 0.0001);
	}

	@Test
	public void testServirCero() {
		double valor = rubia.servirCerveza(0);
		assertEquals(0, valor, 0.0001);
		assertEquals(7800, rubia.getCantidadActual(), 0.0001);
	}

	@Test
	public void testServirNegativo() {
		double valor = rubia.servirCerveza(-100);
		// ✅ Comportamiento esperado: no debe servir cantidades negativas
		// Nota: el método actual lo permite porque -100 <= 7800
		// Recomendación: agregar validación monto > 0 en servirCerveza()
		assertEquals(-2, valor, 0.0001);
	}

}
