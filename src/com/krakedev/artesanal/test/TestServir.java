package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean resultado;
		
		Maquina rubia = new Maquina("Pilsener","Cerveza fria", 0.02, 8000, "017");
		System.out.println("============ESTADO INICIAL===========");
		rubia.imprimir();
		
		System.out.println("============LLENAR 1===========");
		rubia.llenarMaquina();
		rubia.imprimir();
		
		System.out.println("============SERVIRSE 5ML===========");
		System.out.println("Valor a pagar: "+rubia.servirCerveza(509.0));
		rubia.imprimir();
		
		System.out.println("============SERVIRSE 6ML===========");
		System.out.println("Valor a pagar: "+rubia.servirCerveza(6000));
		rubia.imprimir();
		
		System.out.println("============SERVIRSE 2ML===========");
		System.out.println("Valor a pagar: "+rubia.servirCerveza(2000));
		rubia.imprimir();

	}

}
