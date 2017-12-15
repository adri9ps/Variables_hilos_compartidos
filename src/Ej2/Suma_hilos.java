package Ej2;

public class Suma_hilos extends Thread {
		
		//Variables
		Suma suma;

		public Suma_hilos(Suma suma) {
			this.suma = suma;
		}

		public void run() {
			for (int i=1; i<=5; i++) {
				System.out.println("Sumando valor " + i + " en hilo " + this.getName());
				suma.nuevaValor(i);
				System.out.println("Haciendo media del hilo " + this.getName() + " con " + suma.getCount() + " valores sumados " + suma.media());
			}
			System.out.println("Las sumas del hilo " + this.getName() + " han finalizado");
		}
	}
