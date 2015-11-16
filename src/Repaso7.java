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

public class Repaso7 extends GraphicsProgram  {

	GRect rectangulo;
	RandomGenerator aleatorio = new RandomGenerator();
	GRect rectangulo1;

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
		
		//si en la posicion en la que se ha hecho clic 
		//esta el rectangulo entonces lo relleno
	
		//la funcion se llama getElementAl
		if(getElementAt(evento.getX(), evento.getY()) == rectangulo ){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		GRect rectangulo1 = new GRect(aleatorio.nextInt(100),aleatorio.nextInt(100));
		rectangulo1.setFilled(true);
		rectangulo1.setFillColor(aleatorio.nextColor());		
		add(rectangulo1, aleatorio.nextInt(800), aleatorio.nextInt(600));		
				
		}

	}

}
