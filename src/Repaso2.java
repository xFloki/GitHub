/*
 * Autor: Alejandro Dietta
 * -----------------------
 * La clase Repaso2 tiene que dibujar un rectangulo 
 * a partir del centro de la pantalla
 */

import acm.graphics.*;
import acm.program.*;

public class Repaso2 extends GraphicsProgram {
	
	//declaro una varibale de instancia para almacenar el rectangulo
	//como es de instancia, se ve desde el init y desde el run 
	GRect rectangulo;
	
	//declaro otra variable de instancia que guardara el punto x de la 
	//pantalla en que empezara a pintarse el rectangulo
	int distanciaX;
	
	public void init(){
		//cambio el tamaño de la pantalla
		setSize(800, 600);
		
		//creo que el rectangulo de 120 de ancho por 80 de alto
		rectangulo = new GRect(120,80);
		add(rectangulo);
	}
	
	public void run(){
		//divido el ancho de la pantalla en dos para saber donde esta 
		//la mitad exacta de la pantalla 
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX,0);
		
	}

}
