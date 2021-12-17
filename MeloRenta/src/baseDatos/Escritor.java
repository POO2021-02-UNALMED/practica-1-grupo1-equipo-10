
package baseDatos;
import java.io.*;
import java.util.*;
import gestorAplicacion_contratos.*;
import gestorAplicacion_Inmuebles.*;


public class Escritor {

	static File archivo = new File("");
	private static ObjectOutputStream objectOutputStream;
	/*Este metodo se ejecuta al cerrar el programa para guardar la base de datos de objetos de cada respectiva clase*/
	///@SuppressWarnings("removal")
	public static void Escribir() {
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\contratos.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt((Contrato.getContratos()).size());
			for (Contrato contrato : Contrato.getContratos())
				objectOutputStream.writeObject(contrato);
			
			
			objectOutputStream.close();
		}
		
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\facturas.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt((Factura.getFacturas().size()));
			for (Factura factura : Factura.getFacturas())
				objectOutputStream.writeObject(factura);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\apartamentos.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt((Apartamento.getApartamentos().size()));
			for (Apartamento apartamento : Apartamento.getApartamentos())
				objectOutputStream.writeObject(apartamento);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\casas.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt((Casa.getCasas().size()));
			for (Casa casa : Casa.getCasas())
				objectOutputStream.writeObject(casa);
			
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\inmuebles.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt((Inmueble.getInmuebles().size()));
			for (Inmueble inmueble : Inmueble.getInmuebles())
				objectOutputStream.writeObject(inmueble);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
		try {
			FileOutputStream salida = new FileOutputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\inquilinos.txt");
			objectOutputStream = new ObjectOutputStream(salida);
			
			objectOutputStream.writeInt((Inquilino.getInquilinos().size()));
			for (Inquilino inquilino : Inquilino.getInquilinos())
				objectOutputStream.writeObject(inquilino);
			
			
			objectOutputStream.close();
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
		
		
		
	}
	
}
	
	
