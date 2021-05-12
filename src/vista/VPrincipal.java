package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.VPrincipalControlador;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class VPrincipal extends JFrame  {

	private JPanel contentPane;
	private JTextField txtContenido;
	private JButton boton2 ;
	private JButton boton1;
	private JButton boton3 ;
	private Map<String , Object> componentes = new HashMap<String , Object>();
	/**
	 * Create the frame.
	 */
	public VPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_superior = new JPanel();
		contentPane.add(panel_superior, BorderLayout.NORTH);
		
		JPanel panel_centro = new JPanel();
		contentPane.add(panel_centro, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Etiqueta");
		panel_centro.add(lblNewLabel);
		componentes.put("lbl", lblNewLabel);
		
		txtContenido = new JTextField();
		txtContenido.setText("Hola que tal");
		componentes.put("txtCaja",txtContenido);
		txtContenido.addKeyListener(new VPrincipalControlador(componentes));
		panel_centro.add(txtContenido);
		txtContenido.setColumns(10);
		
		JPanel panel_botones = new JPanel();
		contentPane.add(panel_botones, BorderLayout.SOUTH);
		
		boton1 = new JButton("Uno");
		boton1.setActionCommand("Uno");
		boton1.addActionListener(new VPrincipalControlador(componentes));
		panel_botones.add(boton1);
		
		boton2 = new JButton("Dos");
		boton2.setActionCommand("Dos");
		boton2.addActionListener(new VPrincipalControlador(componentes));
		panel_botones.add(boton2);
		
		boton3 = new JButton("Tres");
		boton3.setActionCommand("Tres");
		boton3.addActionListener(new VPrincipalControlador(componentes));
		panel_botones.add(boton3);
		

	}



}
