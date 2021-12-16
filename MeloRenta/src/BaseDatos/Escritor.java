
package BaseDatos;
import java.io.*;
import java.util.*;
import gestorAplicacion_contratos.*;
import gestorAplicacion_Inmuebles.*;


public class Escritor {

	static File archivo = new File("");
	private static ObjectOutputStream objectOutputStream;
	/*Este metodo se ejecuta al cerrar el programa para guardar la base de datos de objetos de cada respectiva clase*/
	@SuppressWarnings("removal")
	public static void Escribir() {
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\vehiculos.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Contrato.getContratos()).size()));
			for (Contrato contrato : Contrato.getContratos())
				objectOutputStream.writeObject(contrato);
			
			
			objectOutputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\sedes.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Sede.getSede()).size()));
			for (Sede sede : Sede.getSede())
				objectOutputStream.writeObject(sede);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
		
	}
	
	
	
	
		/*
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\clientes.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Cliente.getClientes()).size()));
			for (Cliente cliente : Cliente.getClientes())
				objectOutputStream.writeObject(cliente);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\repartidores.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Repartidor.getRepartidores()).size()));
			for (Repartidor repartidor : Repartidor.getRepartidores())
				objectOutputStream.writeObject(repartidor);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\ordenes.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer(Orden.getOrdenes().size()));
			for (Orden orden : Orden.getOrdenes())
				objectOutputStream.writeObject(orden);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\src\\baseDatos\\temp\\productos.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt(new Integer((Producto.getProductos()).size()));
			for (Producto producto : Producto.getProductos())
				objectOutputStream.writeObject(producto);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		

	}
}	    
/*
