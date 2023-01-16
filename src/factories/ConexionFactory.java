package factories;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConexionFactory {
	private DataSource datasourse;
	
	public ConexionFactory() {
		ComboPooledDataSource pooledDataSourse = new ComboPooledDataSource();
		 
		pooledDataSourse.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimezone=true&serverTimezone=UTC");
		pooledDataSourse.setUser("root");
		pooledDataSourse.setPassword("Tigres132");
		this.datasourse=pooledDataSourse;
	}
	
	public Connection nuevaConexion() {
		try {
			return this.datasourse.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
