package com.krakedev.artesanal;

public class Maquina {
	
	private String nombreCerveza;
	private String descripcion;
	private double precioPorMl;
	private double capacidadMaxima;
	private double cantidadActual;
	private String codigo;	
	
	
	public Maquina(String nombreCerveza, String descripcion, double precioPorMl, double capacidadMaxima, String codigo) {
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcion;
		this.precioPorMl = precioPorMl;
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = 0;
		this.codigo = codigo;
	}
	
	public Maquina(String nombreCerveza, String descripcioin, double precioPorMl, String codigo) {
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcioin;
		this.precioPorMl = precioPorMl;
		this.capacidadMaxima = 10000;
		this.cantidadActual = 0;
		this.codigo = codigo;
	}	
		
	public String getNombreCerveza() {
		return nombreCerveza;
	}
	public void setNombreCerveza(String nombreCerveza) {
		this.nombreCerveza = nombreCerveza;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioPorMl() {
		return precioPorMl;
	}
	public void setPrecioPorMl(double precioPorMl) {
		this.precioPorMl = precioPorMl;
	}
	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}
	//proteger capacidadMaxima
	/*public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}*/
	public double getCantidadActual() {
		return cantidadActual;
	}
	//proteger capacidadActual	
	/*public void setCantidadActual(double cantidadActual) {
		this.cantidadActual = cantidadActual;
	}*/
	
	public String getCodigo() {
		return codigo;
	}

	/*public void setCodigo(String codigo) {
		this.codigo = codigo;
	}*/
	
	//metodos	
	public void imprimir() {
		String mensaje = "Nombre de Cerveza: "+this.nombreCerveza+
						", Descripcion: "+this.descripcion+
						", Precio por Ml: "+this.precioPorMl+
						", Capacidad Maxima: "+this.capacidadMaxima+						
						", Cantidad Actual: "+this.cantidadActual+
						", Codigo: "+this.codigo;
		System.out.println(mensaje);
	}
	
	public void llenarMaquina() {
		this.cantidadActual = this.capacidadMaxima - 200;
	}
	
	public boolean recargarCerveza(double cantidad) {
		double limitePermitido = this.capacidadMaxima-200;
		if ((this.cantidadActual + cantidad) <= limitePermitido) {
			this.cantidadActual = this.cantidadActual + cantidad;
			return true;
		}else {
			return false;
		}
	}
	
	public double servirCerveza(double cantidad) {
		if (this.cantidadActual >= cantidad) {
			this.cantidadActual -= cantidad;
			
			double valor = cantidad * this.precioPorMl;
			return valor;
		}else {
			return 0;
		}
	}
	

}
