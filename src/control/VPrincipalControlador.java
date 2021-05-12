package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class VPrincipalControlador implements ActionListener , KeyListener{

	private Map<String , Object> componentes = new HashMap<String , Object>();
	
	public VPrincipalControlador(Map<String , Object> componentes) {
		super();
		this.componentes = componentes;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		//Object o = e.getSource(); // Con el objeto
		String s= e.getActionCommand();//Con un action command que hemos determinado 
//		if(o==boton2) {
//			System.out.println("Boton dos");
//		}
//		else if (s.equals("Uno")) {
//			System.out.println("Boton uno");
//		}
//		else if(o==boton3) {
//		System.out.println("Boton 3");
//	}
		switch (s) {
		case "Uno": System.out.println(((JTextField)componentes.get("txtCaja")).getText());break;
		case "Dos":System.out.println(((JLabel)componentes.get("lbl")).getText());
		((JLabel)componentes.get("lbl")).setText("Valor de etiqueta cambiado");
		break;
		//case "Tres":txtContenido.setText("Tres");break;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Hola");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
