package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestArtesanal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina rubia = new Maquina("Pilsener","Cerveza rubia",0.02,"cod012");
		rubia.imprimir();
		
		rubia.setNombreCerveza("Golden Ale");
		rubia.setDescripcion("Cerveza rubia mas intensa");
		rubia.imprimir();
		
		Maquina rubia2 = new Maquina("Club","Cerveza oscura",0.05,5000,"cod013");
		rubia2.imprimir();
		
		rubia2.setNombreCerveza("Modelo Negra");
		rubia2.setDescripcion("Cerveza negra mas concentrada");
		rubia2.imprimir();
		
		
	}

}
