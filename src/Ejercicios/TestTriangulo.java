package Ejercicios;

public class TestTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{	
		Triangulo t1= new Triangulo(1,2,2);
		System.out.println(t1);
		Triangulo t2= new Triangulo(1,1,2);
		System.out.println(t2);
	}catch(IlegalTrianguloException e){
		System.out.println("Triangulo no válido");
	}
	}

}
