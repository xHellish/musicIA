package defecto;
import musicIA.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LetraIA letra1 = new LetraIA("Frase");
		
		CancionIA cancion1 = new CancionIA(letra1, "Pop");
		CancionIA cancion2 = new CancionIA(letra1, "Rock");
		CancionIA cancion3 = new CancionIA(letra1, "Bachata");
		
	}
}
