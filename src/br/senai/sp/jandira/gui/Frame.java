package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jandira.model.Matematica;

public class Frame {
	
	public void criarFrame() {
		
		Color meuVerde = new Color(147, 196, 125);
		
		new Font("Sans Serif", Font.BOLD, 24);
		
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600, 600);
	frame.setTitle("Tabuada");
	frame.setLayout(null);
	
	// X, Y, width, height
	
	// Header do Frame
	JPanel header = new JPanel();
	header.setBounds(0, 0, 600, 50);
	header.setBackground(Color.WHITE);
	header.setLayout(null);
	 
	JLabel lblTabuada = new JLabel("Tabuada");
	lblTabuada.setForeground(Color.BLUE);
	lblTabuada.setFont(new Font("Sans Serif", Font.BOLD, 20));
	lblTabuada.setBounds(20, 10, 100, 30);
	header.add(lblTabuada);
	
	// Comandos teste para imagem
	
//	BufferedImage image = ImageIO.read(new File(calculator.jpg));
	
//	 ImageIcon icon = new ImageIcon(calculator.jpg);
	
//	ImageIcon icon = new ImageIcon(calculator.png);
	
//	frame.add(new JLabel(new ImageIcon(br.senai.sp.jandira/images/calculator.png)));
	
//	JLabel wIcon = new JLabel(new ImageIcon(wPic));
	
	// PAINEL2
	
	JPanel panelFormulario = new JPanel();
	panelFormulario.setBounds(20, 60, 250, 390);
	panelFormulario.setBackground(null);
	panelFormulario.setLayout(null);
	
	// PAINEL3
	
	JPanel panelFormulario2 = new JPanel();
	panelFormulario2.setBounds(270, 60, 250, 390);
	panelFormulario2.setBackground(Color.WHITE);
	panelFormulario2.setLayout(null);
	
	
	JLabel lblMultiplicando = new JLabel();
	lblMultiplicando.setText("Multiplicando: ");
	lblMultiplicando.setBounds(20, 60, 130, 30);
	lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
	panelFormulario.add(lblMultiplicando);
	
	JLabel lblMultiplicador = new JLabel();
	lblMultiplicador.setText("Máximo multiplicador: ");
	lblMultiplicador.setBounds(20, 100, 130, 30);
	panelFormulario.add(lblMultiplicador);
	
	JTextField txtMultiplicando = new JTextField();
	txtMultiplicando.setText(null);
	txtMultiplicando.setBounds(150, 60, 80, 30);
	panelFormulario.add(txtMultiplicando);
	
	JTextField txtMultiplicador = new JTextField();
	txtMultiplicador.setText("");
	txtMultiplicador.setBounds(150, 100, 80, 30);
	panelFormulario.add(txtMultiplicador);
	
	JButton btnCalcular = new JButton("Calcular");
	btnCalcular.setBounds(20, 160, 210, 60);
	btnCalcular.setBackground(new Color(147, 196, 125));
	btnCalcular.setForeground(Color.WHITE);
	btnCalcular.setFont(new Font("Sans Serif", Font.BOLD, 25));
	panelFormulario.add(btnCalcular);
	
	JButton btnLimpar = new JButton("Limpar");
	btnLimpar.setBounds(20, 240, 210, 60);
	btnLimpar.setBackground(Color.RED);
	btnLimpar.setForeground(Color.WHITE);
	btnLimpar.setFont(new Font("Sans Serif", Font.BOLD, 25));
	panelFormulario.add(btnLimpar);
	
	JLabel lblResultado = new JLabel("Resultado: ");
	lblResultado.setForeground(Color.BLUE);
	lblResultado.setFont(new Font("Sans Serif", Font.BOLD, 15));
	lblResultado.setBounds(280, 110, 100, 30);
//	panelFormulario2.add(lblResultado);
	
	// JList:
	
	JScrollPane scroll = new JScrollPane();
	scroll.setBounds(280, 150, 150, 210);
//	panelFormulario2.add(scroll);
	
	JList tabuadaList = new JList();
	scroll.getViewport().add(tabuadaList);
	
	DefaultListModel tabuadaModel = new DefaultListModel();
	tabuadaList.setModel (tabuadaModel);

	frame.getContentPane().add(lblTabuada);
	frame.getContentPane().add(panelFormulario);
	frame.getContentPane().add(lblResultado);
	frame.getContentPane().add(scroll);
//	frame.getContentPane().add(panelFormulario2);
	frame.getContentPane().add(header);
	
	
	// Último
	frame.setVisible(true);
	
	btnCalcular.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Matematica tabuada = new Matematica();
		    
			int multiplicando = Integer.parseInt(txtMultiplicando.getText());
			int multiplicador = Integer.parseInt(txtMultiplicador.getText());
			
			tabuada.setMultiplicando(multiplicando);
			tabuada.setMultiplicador(multiplicador);
			
			String[] resultadoTabuada = tabuada.calcular();
		    
		    for (int i = 0; i < resultadoTabuada.length; i++) {
		    	tabuadaModel.addElement(resultadoTabuada[i]);
		    }
		}
	});
	
	btnLimpar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			txtMultiplicador.setText("");
			txtMultiplicando.setText("");
			
			txtMultiplicando.requestFocus();
			
			tabuadaModel.clear();
			
		}
	});
	
	
	
	
	}
	
	

}
