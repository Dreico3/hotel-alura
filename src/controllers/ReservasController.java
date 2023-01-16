package controllers;

import java.sql.Connection;

import dao.ReservasDao;
import factories.ConexionFactory;
import models.Reservas;

public class ReservasController {
	private ReservasDao reservasDao;
	
	public ReservasController() {
		Connection con = new ConexionFactory().nuevaConexion();
		this.reservasDao=new ReservasDao(con);
	}
	
	public void guardar(Reservas reserva) {
		this.reservasDao.crear(reserva);
	}
}
