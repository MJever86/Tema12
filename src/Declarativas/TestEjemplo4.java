package Declarativas;

import java.io.File;
import java.io.FileNotFoundException;

public class TestEjemplo4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int longitud=11;
		File inFile=new File("/home/matinal/Escritorio/nombres_mujer.txt");
		try{
		String nombreBuscado=Ejemplo4.buscarPalabra(inFile, longitud);
		System.out.println("Nombre buscado: "+nombreBuscado);
	}catch(FileNotFoundException e){
		System.out.println("Fichero no encontrado");
	}
}
}	


