package segundos;

public class Horario {
	
	int segundo;
	
	void setSegundo(int s) {
		if(s >= 0 && s <= 86399) {
			segundo = s;
		}
	}
	
	int getSegundo() {
		return segundo;
	}

}
