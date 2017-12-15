package Ej2;

public class Main {
	
	public static void main(String[] args) {
		
		//Objeto suma
		Suma suma = new Suma();
		
		//Creamos hilos 
		Thread th1 = new Suma_hilos(suma);
		Thread th2 = new Suma_hilos(suma);
		Thread th3 = new Suma_hilos(suma);
		Thread th4 = new Suma_hilos(suma);
		Thread th5 = new Suma_hilos(suma);
		Thread th6 = new Suma_hilos(suma);
		
		//Iniciamos hilos
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		
		//
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
			th6.join();
			System.out.println("Final: " + suma.getSuma());
			System.out.println("Media: " + suma.media());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
