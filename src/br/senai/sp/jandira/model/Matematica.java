package br.senai.sp.jandira.model;

public class Matematica {

	private int multiplicando;
	private int multiplicador;
	
	private String extenso;
	private int contador = 0;
//	private String calculo;
	
	public void calcular() {
		
		while (contador <= multiplicador) {
			extenso = multiplicando + " x " + contador + " = " + Math.multiplyExact(multiplicando, contador);
			
			System.out.println(extenso);
			
			contador++;
		}
	}

	public void setMultiplicando(String multiplicando) {
		this.multiplicando = Integer.parseInt(multiplicando);
	}
	
	public int getMultiplicando() {
		return this.multiplicando;
	}

	public void setMultiplicador(String multiplicador) {
		this.multiplicador = Integer.parseInt(multiplicador);
	}
	
	public int getMultiplicador() {
		return this.multiplicador;
	}
	
	public void setExtenso(String extenso) {
		this.extenso = extenso;
	}
	public String getExtenso() {
		return this.extenso;
	}
	
	
	
//	System.out.println("CONSTRUA SUA TABUADA!!");
//	System.out.println(" ");
//	
//	System.out.print("Qual o multiplicando? ");
//	multiplicando = leitor.nextInt();
//	System.out.print("Qual o máximo multiplicador? ");
//	multiplicador = leitor.nextInt();
//	System.out.println(" ");
//	
//	leitor.close();
//	
//	System.out.println("TABUADA DO " + multiplicando);
//	System.out.println("----------------------");
//	
//	while (contador <= multiplicador) {
//		System.out.println(multiplicando + " x " + contador + " = " + multiplicando * contador);
//		
//		contador++;
//	}
	
	
}