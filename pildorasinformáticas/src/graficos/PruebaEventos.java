package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoBotones mimarco=new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}

class MarcoBotones extends JFrame{
	public MarcoBotones(){
		setTitle("Botones y Eventos");
		setBounds (700,300,500,300);
		LaminaBotones milamina=new LaminaBotones();
		add(milamina);
	}
}

class LaminaBotones extends JPanel implements ActionListener {
	JButton botonAzul=new JButton("Azul");
	public LaminaBotones(){
		add(botonAzul);
		botonAzul.addActionListener(this); //Ponemos a la escucha a la propia lamina
	}
	public void actionPerformed(ActionEvent e){
		setBackground(Color.blue);
	}
}