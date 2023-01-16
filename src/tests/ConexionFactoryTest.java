package tests;

import java.sql.Connection;

import factories.ConexionFactory;

public class ConexionFactoryTest {
	public static void main(String [] args) {
		System.out.println("probando la conexion perra");
		ConexionFactory con = new ConexionFactory();
		System.out.println("recuperando  la conexion");
		Connection conexion = con.nuevaConexion();
		try {
			conexion.close();	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			System.out.println("cerrado la conexion");
		
	}
}
