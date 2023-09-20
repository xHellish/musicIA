package musicIA;

public class CancionIA {
	
	String _letra;
	String archivoMP3;
	boolean reproduciendo;
	
	
	public CancionIA (LetraIA letra, String genero) {
		
		_letra = letra.letrafinal;
		reproduciendo = true;
		archivoMP3 = "Reproduciendo canción con letra " + letra.letrafinal + " y género " + genero;
		System.out.println(archivoMP3);
		
		
		
	}
	
	public void agregarGenero (String nuevoGenero) {
		
		if (reproduciendo == false) {
			archivoMP3 = "Reproduciendo canción con letra " + _letra + " y género " + nuevoGenero;
		}else {
			System.out.println("Guardado en cola canción de género "+ nuevoGenero);
		}	
	}
}
