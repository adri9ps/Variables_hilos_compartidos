package Ej1;

public class ClaseRunnable implements Runnable{
	
	String a;
	
	ClaseRunnable(String a) {
		this.a = a;
		Thread t = new Thread(this);
		t.start();
		try {
			System.out.println("Segundo hilo comenzado");
			t.join();
			System.out.println("Segundo hilo finalizado");
		} catch (InterruptedException e) {
			System.out.println("Se ha parado el hilo");
		}
		
	}

	@Override
	public void run() {
		try {
			for(int i=1; i<=5 ; i++) {
				System.out.println(this.a);
				System.out.println("Main aqui...");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("El hilo se ha interrumpido");
		}
	}
}
