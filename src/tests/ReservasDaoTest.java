package tests;

import java.sql.Date;

import dao.ReservasDao;
import factories.ConexionFactory;
import models.Reservas;

public class ReservasDaoTest {
	public static void main(String[] args) {
		ReservasDao reservadao = new ReservasDao(new ConexionFactory().nuevaConexion());
		Reservas re = new Reservas(Date.valueOf("2023-01-16"), Date.valueOf("2022-02-04"), 100, "cuerpo");
		reservadao.crear(re);
		System.out.println("creado");
		
		reservadao.listar().forEach(r->{
			System.out.println(r);
		});
		
	}
}
