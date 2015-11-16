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

public class Repaso10 extends GraphicsProgram  {

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
			double distanciaAlCentroDelRectanguloY = 
					evento.getY() - rectangulo.getY();
			double distanciaAlCentroDelRectanguloX = 
					evento.getX() - rectangulo.getX();

			if(distanciaAlCentroDelRectanguloY < rectangulo.getHeight() / 2){
				if(distanciaAlCentroDelRectanguloX > rectangulo.getWidth()/2){
					rectangulo.move(20, -10);
				} else {
					rectangulo.move(-20, -10);
				}
			} 
				else {
				if(distanciaAlCentroDelRectanguloX < rectangulo.getWidth()/2){
					rectangulo.move(-10, 20);
				} else {
					rectangulo.move(20, 10);
				}
			} 

		}
	}
	}
		




