package baseDatos;

import java.io.*;
import java.util.*;
import gestorAplicacion_contratos.*;
import gestorAplicacion_Inmuebles.*;
public class Lector {
	static ObjectInputStream objectInputStream;
	static File archivo = new File("");
	/*Este metodo se ejecuta al ejecutar el programa para cargar la base de datos de objetos de cada eespectiva clase*/
	public static void Leer() {
		
		///leer Contratos
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\contratos.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numContratos = objectInputStream.readInt();
			Contrato contrato;
			for (int i =1; i<=numContratos; i++ ) {
				contrato = (Contrato) objectInputStream.readObject();
				Contrato.adicionarContrato(contrato);
				
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			if (excepcion.getMessage() != null){
				System.out.println(excepcion.getMessage());
			}
		}
		
		///Leer Facturas
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\facturas.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numFacturas = objectInputStream.readInt();
			Factura factura;
			for (int i =1; i<=numFacturas; i++ ) {
				factura = (Factura) objectInputStream.readObject();
				Factura.adicionarFactura(factura);
				
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			if (excepcion.getMessage() != null){
				System.out.println(excepcion.getMessage());
			}
		}
		
		///Leer Apartamentos
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\apartamentos.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numApartamentos = objectInputStream.readInt();
			Apartamento apartamento;
			for (int i =1; i<=numApartamentos; i++ ) {
				apartamento = (Apartamento) objectInputStream.readObject();
				Apartamento.adicionarApartamento(apartamento);
								
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			if (excepcion.getMessage() != null){
				System.out.println(excepcion.getMessage());
			}
		}
		
		///leer Casas
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\casas.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numCasas = objectInputStream.readInt();
			Casa casa;
			for (int i =1; i<=numCasas; i++ ) {
				casa = (Casa) objectInputStream.readObject();
				Casa.adicionarCasa(casa);
								
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			if (excepcion.getMessage() != null){
				System.out.println(excepcion.getMessage());
			}
		}
		
		//Leer Inmuebles
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\inmuebles.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numInmuebles = objectInputStream.readInt();
			Inmueble inmueble;
			for (int i =1; i<=numInmuebles; i++ ) {
				inmueble = (Inmueble) objectInputStream.readObject();
				Inmueble.adicionarInmueble(inmueble);
								
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			if (excepcion.getMessage() != null){
				System.out.println(excepcion.getMessage());
			}
		}
		
		//Leer Inquilinos
		try {
			FileInputStream entrada = new FileInputStream(archivo.getAbsolutePath()+"\\baseDatos\\temp\\inquilinos.txt");
			objectInputStream = new ObjectInputStream(entrada);
			
			int numInquilinos = objectInputStream.readInt();
			Inquilino inquilino;
			for (int i =1; i<=numInquilinos; i++ ) {
				inquilino = (Inquilino) objectInputStream.readObject();
				Inquilino.adicionarInquilino(inquilino);
								
				
			}
			objectInputStream.close();
		}
		
		catch(Exception excepcion) {
			if (excepcion.getMessage() != null){
				System.out.println(excepcion.getMessage());
			}
		}
	}
}
