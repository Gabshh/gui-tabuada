package br.senai.sp.jandira.model;

public class Matematica {

	private int multiplicando;
	private int multiplicador;
	
	// "i" (index)
	
	public String[] calcular() {
		
		String[] tabuada = new String[multiplicador + 1];
		
		for (int i = 0; i <= multiplicador; i++) {
			int resultado = Math.multiplyExact(multiplicando, i);
			tabuada[i] = multiplicando + " x " + i + " = " + resultado;
			
		}
		
		return tabuada;
		
	}
	
	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public int getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	public int getMultiplicador() {
		return multiplicador;
	}
	
//	private String extenso;
//	private int contador = 0;
////	private String calculo;
//	
//	public void calcular() {
//		
//		while (contador <= multiplicador) {
//			extenso = multiplicando + " x " + contador + " = " + Math.multiplyExact(multiplicando, contador);
//			
//			System.out.println(extenso);
//			
//			contador++;
//		}
//	}
//
//	public void setMultiplicando(String multiplicando) {
//		this.multiplicando = Integer.parseInt(multiplicando);
//	}
//	
//	public int getMultiplicando() {
//		return this.multiplicando;
//	}
//
//	public void setMultiplicador(String multiplicador) {
//		this.multiplicador = Integer.parseInt(multiplicador);
//	}
//	
//	public int getMultiplicador() {
//		return this.multiplicador;
//	}
//	
//	public void setExtenso(String extenso) {
//		this.extenso = extenso;
//	}
//	public String getExtenso() {
//		return this.extenso;
//	}
	
	
}