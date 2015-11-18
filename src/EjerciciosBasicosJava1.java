import acm.program.*;

public class EjerciciosBasicosJava1 extends ConsoleProgram {

	public void run(){
		println(multiplo(3));
		println(multiplo(10));
		println(multiplo(15));
	}
//i
	private boolean fiestaArdillas(boolean findesemana, int bellotas){
		if (!findesemana){
			if(bellotas >= 40 && bellotas <= 60){
				return true;
			}
			return false;
		}  else {

			return true;
		}		 

	}

	private int comprobarMulta(int speed, boolean isBirthday){
		if(!isBirthday){
			if(speed<61){
				return 0;
			} else {
				if(speed>60 && speed<81){
					return 1;
				} else {

					return 2;
				} 
			}

		} else {
			if(speed<66){
				return 0;
			} else {
				if(speed>65 && speed<86){
					return 1;
				} else {

					return 2;
				}
			}
		}
	}
	
	//	numero muy vanidoso si es multiplo de 11 o si es uno mas de un multiplo de 11
	// devuelve true si el numero no negativo dado es muy vanidoso 
	
	public boolean compruebaVanidoso(int numero){
		if(numero % 11 == 0 || (numero-1)%11 == 0){
			return true;
		} else 
		return false;
	}


// true si hay que responder 
	// normalmente si, dormido nunca, mañana solo madre 
	
	private boolean contesta(boolean isMorning, boolean isMom, boolean isAsleep){
		if(isAsleep){
			return false;
		} else { 
			if(isMorning){
				if(isMom){
					return true;
				}
				return false;
			} else {
				return true;
			}
		}
		
	}
	
	
	// nos dan 3 enteros, devuelve true si uno de ellos es 10 menos que uno de los otros 
	
	
	private boolean diezMenos(int a, int b, int c){		

		if((a-b) >= 10 ||(a-c) >= 10 ||(b-c) >= 10 ||(b-a) >= 10 ||(c-a) >= 10 ||(c-b) >= 10 ){
			return true;
		}
		return false;
	}
	
	
	// se dan dos enteros ambos en el rango 10..99
	// se devuelve true si hay hay un digito que se repita en ambos numeros
	
	public boolean mismoDigito(int a, int b){
		if(a/10 == b/10 || a%10 == b%10 || a/10 == b%10 || b/10 == a%10){
			return true;
		} else {
			return false;
		}
		
	}
	
	// devolvemos verdadero si un numero no negativo dado es multiplo de 3 o 5 pero no de ambos
	// utilizaremos el operador "mod"%
	
	private boolean multiplo(int a){
		if(a%3 == 0 && a%5 == 0 ){
			return false;
		} else {
			if(a%3 == 0){
				return true;
			}
			if(a%5 == 0){
				return true;
			} else {
				return false;
			}
			
		}
	}
	
	
	// 
	
	
}

























