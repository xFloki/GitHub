/*
 * Autor:Alejandro Dietta Martin
 * -----------------------------
 * Repaso5 añade soporte al programa para poder escuchar 
 * los clic del ratón
 * Lo que hara el programa es cambiar el color de relleno de un 
 * rectangulo cada vez que se pulse clic
 */

import java.awt.event.MouseEvent;


import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class Repaso5 extends GraphicsProgram  {

	GRect rectangulo;
	RandomGenerator aleatorio = new RandomGenerator();

	public void init(){
		setSize(800, 600);
		rectangulo = new GRect(120,80);
		//inserto el listener del raton
		addMouseListeners();
	}

	public void run(){
		add(rectangulo,
				getWidth()/2 - rectangulo.getWidth()/2, 
				getHeight()/2 - rectangulo.getHeight()/2
				);


	}
	
	//añado el metodo que escucha el evento del clic del raton
	
	public void mouseClicked (MouseEvent evento){
		if(evento.getButton() == MouseEvent.BUTTON1){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		}

	}

}
