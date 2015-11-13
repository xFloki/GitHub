/*
 * Autor:Alejandro Dietta Martin
 * -----------------------------
 * Repaso6 
 * Cuando se hace clic en un rectangulo central, genera un 
 * nuevo rectangulo aleatorio
 */

import java.awt.event.MouseEvent;


import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class Repaso8 extends GraphicsProgram  {

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

		if(getElementAt(evento.getX(), evento.getY()) == rectangulo ){
			double distanciaAlCentroDelRectangulo = 
					evento.getX() - rectangulo.getX();
			
			if(distanciaAlCentroDelRectangulo < rectangulo.getWidth() / 2){
				rectangulo.move(-20, 0); 			
			} else {
				rectangulo.move(20, 0); 	
			}

		}

	}
}
