package Ej1;

public class Hilo extends Thread{

	
	String a;
	
	Hilo(String a) {
		this.a = a;
	}
	
	public void run() {
		try {
			//Mostramos el numero de veces que queremos que se muestre el hilo
			for(int i=1; i<=5 ; i++) {
				System.out.println(this.a);
				sleep(1000);
			}
			
		} catch (InterruptedException e) {
			//Si el hilo es interrumpido
			System.out.println("El hilo se ha detenido");
		}
	}

}
