/*
	Muestra en Consola un Mensaje de Hola Mundo
*/

public class HolaMundo{
	public  static void Main(String[] args){
		String naranja = "\033[33m";
		String azul = "\033[34m";
		int a = 5;
		int b = 3;
		System.out.println(naranja + "Hola HolaMundo");

		int c = a + b;

		System.out.println(azul + "El Resultado es : " + c);
	}
}