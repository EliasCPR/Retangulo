package br.com.empresa.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.empresa.model.Retangulo;

public class FrameRetangulo {
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Calculos com ret�ngulo");
		
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(3);
		tela.setLayout(null);
		
		
//		build one JLabel
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(10, 10, 60, 30);
		
//		base JLabel  
		
		JLabel labelBase = new JLabel();
		labelBase.setText("Base:");
		labelBase.setBounds(10, 50, 60, 30);
		
//		build one textField
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 10, 50, 30);
		
//      Base textField  
		
		JTextField textBase = new JTextField();
		textBase.setBounds(70, 50, 50, 30);
		
//		construir um botao
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("calcular");
		btnCalcular.setBounds(10, 100, 110, 30);
		
		JButton btnLimpar = new JButton();
		btnLimpar.setText("limpar");
		btnLimpar.setBounds(10,140, 110, 30);
		
//		jlabel do perimetro e da area
		
		JLabel labelArea = new JLabel();
		labelArea.setText("Per�metro:");
		labelArea.setBounds(150, 10, 70, 30);
		
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Per�metro:");
		labelPerimetro.setBounds(150, 50, 70, 30);
		
//		JLabel de valores 
		
		JLabel labelValorArea = new JLabel();
		
		tela.getContentPane().add(textAltura);
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(textBase);
		tela.getContentPane().add(labelBase);
		tela.getContentPane().add(labelBase);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(labelArea);
		tela.getContentPane().add(labelPerimetro);
		
		tela.setVisible(true);
		
//		ouvintes de a��es /eventos
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Retangulo r1 = new Retangulo();
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
				
				labelArea.setText(String.valueOf(r1.calcularArea()));
				labelPerimetro.setText(String.valueOf(r1.calcularPerimetro()));
			}
			
			
		});
		
				
	}
	
}
