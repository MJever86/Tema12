package Declarativas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Declarativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile= new File("../Escritorio/nombres_mujer.txt");
		
		try(Scanner in= new Scanner(inFile);){
			while(in.hasNext());
				System.out.print(in.next()+"--");
			
		}catch(FileNotFoundException e){
			System.out.println("No existe el fichero");
		}
	}

}
