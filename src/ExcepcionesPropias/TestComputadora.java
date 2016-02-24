package ExcepcionesPropias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestComputadora {

	public static void main(String[] args) {
		// guardamos en una coleccion de 3 computadoras
		List<Computadora> lista = new ArrayList<Computadora>();
		Scanner in= new Scanner (System.in);
		System.out.println("Introduce datos:");
		while(in.hasNextLine() &&lista.size()!=3){
			String nombre=in.next();
			double hd= in.nextDouble();
			double ram= in.nextDouble();
			String mac= in.next();
		try{	
			Computadora c= new Computadora(nombre, hd, ram, mac);
			lista.add(c);
		} catch (NoMACCorrectaException e) {
			System.out.println("Direccion MAC erronea");
			}
		}
		System.out.println(lista);
	}
}



