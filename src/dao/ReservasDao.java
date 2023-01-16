package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Reservas;

public class ReservasDao {
	final private Connection con;

	public ReservasDao(Connection con) {
		this.con = con;
	}
	
	public  List<Reservas> listar() {
		try {
			List<Reservas> lista = new ArrayList<>();
			final PreparedStatement statement = con.prepareStatement("select * from reservas");
			try(statement){
				final ResultSet resultset = statement.executeQuery();
				try(resultset){
					while(resultset.next()) {
						lista.add(new Reservas(resultset.getInt("id"),
								resultset.getDate("fecha_entrada"), resultset.getDate("fecha_salida"),resultset.getInt("valor"),resultset.getString("forma_pago")));
					}
				}
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void crear(Reservas re) {
		try {
			final PreparedStatement statement = con.prepareStatement("INSERT INTO reservas (fecha_entrada, fecha_salida, valor, forma_pago) VALUES (?, ?, ?, ?);");
			statement.setDate(1, re.getFechaE());
			statement.setDate(2, re.getFechaS());
			statement.setInt(3, re.getValor());
			statement.setString(4, re.getFormaPago());
			statement.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
