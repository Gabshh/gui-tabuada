package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Frame {
	
	public void criarFrame() {
		
		new Font("Sans Serif", Font.BOLD, 24);
		
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600, 600);
	frame.setTitle("Tabuada");
	frame.setLayout(null);
	
	// X, Y, width, height
	 
	
	JLabel lblTabuada = new JLabel("Tabuada");
	lblTabuada.setForeground(Color.blue);
	lblTabuada.setFont(new Font("Sans Serif", Font.BOLD, 20));
	lblTabuada.setBounds(20, 20, 100, 30);
	
	JLabel lblMultiplicando = new JLabel();
	lblMultiplicando.setText("Multiplicando: ");
	lblMultiplicando.setBounds(65, 60, 90, 30);
	
	JLabel lblMultiplicador = new JLabel();
	lblMultiplicador.setText("Máximo multiplicador: ");
	lblMultiplicador.setBounds(20, 100, 130, 30);
	
	JTextField txtMultiplicando = new JTextField();
	txtMultiplicando.setText(null);
	txtMultiplicando.setBounds(150, 60, 80, 30);
	
	JTextField txtMultiplicador = new JTextField();
	txtMultiplicador.setText("");
	txtMultiplicador.setBounds(150, 100, 80, 30);
	
	JButton btnCalcular = new JButton("Calcular");
	btnCalcular.setBounds(20, 160, 210, 60);
	
	JButton btnLimpar = new JButton("Limpar");
	btnLimpar.setBounds(20, 240, 210, 60);
	
	JLabel lblResultado = new JLabel("Resultado: ");
	lblResultado.setForeground(Color.blue);
	lblResultado.setFont(new Font("Sans Serif", Font.BOLD, 15));
	lblResultado.setBounds(280, 55, 100, 30);
	
	// JList:
	
	JScrollPane scroll = new JScrollPane();
	scroll.setBounds(280, 90, 150, 210);
	
	JList tabuadaList = new JList();
	scroll.getViewport().add(tabuadaList);
	
	
	
	frame.getContentPane().add(lblTabuada);
	frame.getContentPane().add(lblMultiplicando);
	frame.getContentPane().add(lblMultiplicador);
	frame.getContentPane().add(txtMultiplicando);
	frame.getContentPane().add(txtMultiplicador);
	frame.getContentPane().add(btnCalcular);
	frame.getContentPane().add(btnLimpar);
	frame.getContentPane().add(lblResultado);
	frame.getContentPane().add(scroll);
	frame.getContentPane().add(tabuadaList);
	
	
	
	
	
	// Último
	frame.setVisible(true);
	
	
	}
	
	

}
