package com.krakedev.artesanal.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Negocio;

public class TestAsignarCodigoCliente {
	
	@Test
	public void asignarCodigo() {
		Negocio barDeMoe = new Negocio();
		
		Cliente mario = new Cliente("Mario B", "140056");
		Cliente eli = new Cliente("Elizabeth", "091234");
		
		barDeMoe.asignarCodigoCliente(mario);
		barDeMoe.asignarCodigoCliente(eli);
		
		assertEquals(100,mario.getCodigo());
		assertEquals(101,eli.getCodigo());
	}

}
