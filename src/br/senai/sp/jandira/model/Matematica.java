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
	
	
}