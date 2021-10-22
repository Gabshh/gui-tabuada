package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Matematica;

public class Main {

	public static void main(String[] args) {
		
		Matematica calculo = new Matematica();
		calculo.setMultiplicando("10");
		calculo.setMultiplicador("6");
		
		calculo.calcular();
		
//		System.out.println(matematica.calcular());
//		System.out.println(matematica.mostrarTabuada());
	}

}
