package models;

import java.sql.Date;

public class Reservas {
	private Integer id;
	private Date fechaE;
	private Date fechaS;
	private Integer valor;
	private String formaPago;

	public Reservas(Integer id, Date fechaE, Date fechaS, Integer valor, String formaPago) {
		this.id = id;
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.formaPago = formaPago;
	}
	
	public Reservas(Date fechaE, Date fechaS, Integer valor, String formaPago) {
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.formaPago = formaPago;
	}

	public void setFormaPago(String forma) {
		this.formaPago = forma;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public Date getFechaE() {
		return this.fechaE;
	}

	public void setFechaE(Date fecha) {
		this.fechaE = fecha;
	}

	public Date getFechaS() {
		return this.fechaS;
	}

	public void setFechaS(Date fecha) {
		this.fechaS = fecha;
	}

	public Integer getValor() {
		return this.valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("forma pago; %s", this.formaPago);
	}

}
