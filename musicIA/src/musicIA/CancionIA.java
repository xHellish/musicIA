package musicIA;

public class CancionIA {
	
	String archivoMP3;
	
	public CancionIA (LetraIA letra, String genero) {
		
		archivoMP3 = "Reproduciendo canción con letra " + letra.letrafinal + " y género " + genero;
		System.out.println(archivoMP3);
	}

}
