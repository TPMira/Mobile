package segundos;

public class Principal {
	public static void main(String [] args) {
		
	Horario h1 = new Horario();
	
	System.out.println("Hora: " + h1.getSegundo());
	
	h1.setSegundo((int)4372);
	
	System.out.println("Hora = " + h1.getSegundo()/3600 + " Minutos = " + h1.getSegundo()%3600/60 + " Segundos = " + h1.getSegundo()%3600%60%60);
		
	}

}
