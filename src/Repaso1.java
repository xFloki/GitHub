/*
 * Autor: Alejandro Dietta Martin
 * ------------------------------
 * Repaso:1 pinta un rectangulo a partir del centro superior de la pantalla 
 */

import acm.graphics.*;
import acm.program.*;

public class Repaso1 extends GraphicsProgram  {
	
	//declaro una variable de instacia para guardar el rectangulo
	GRect rectangulo;
	
	//recuerda que el init se ejectua siempre antes que el run 
	public void init(){
		
		setSize(800, 600);
		
		//el primer parametro del rectangulo es el ancho
		//y el segundo el alto
		//tercero x
		//cuarto y
		rectangulo = new GRect(120,80, 0,0);
		
	}
	
	public void run(){
		//añado el objeto GRect al lienzo
		//si no especifico la posicion, aparece en (0,0)
		add(rectangulo);
	}

}
