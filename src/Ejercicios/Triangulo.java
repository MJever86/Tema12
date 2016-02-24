package Ejercicios;
/**
 * 
 * @author Maria Jose
 * @version 1.0
 *
 */

public class Triangulo {
	//atributos: los tres lados
	private int ladoa;
	private int ladob;
	private int ladoc;

	/**
	 * @param ladoa
	 * @param ladob
	 * @param ladoc
	 */
	public Triangulo(int ladoa, int ladob, int ladoc) throws IlegalTrianguloException {
		if(esTriangulo(ladoa, ladob, ladoc)){
		this.ladoa = ladoa;
		this.ladob = ladob;
		this.ladoc = ladoc;
	}
		else
		throw new IlegalTrianguloException();
	}	
	private boolean esTriangulo(int ladoa, int ladob, int ladoc){
		return ladoa+ladob>ladoc && ladoa+ladoc>ladob
				&& ladob+ladoc>ladoa;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangulo [ladoa=" + ladoa + ", ladob=" + ladob + ", ladoc=" + ladoc + "]";
	}
	

	
}
