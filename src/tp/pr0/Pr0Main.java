package tp.pr0;

public class Pr0Main {

	public static void escribeSaludo (String nombre) {
		System.out.println("Hola "+nombre);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prueba de GIT nuevaaa 
		//NUEVA PRUEBA HOY 22/10/2020
		System.out.println("Hola mundo");
		//Llamada funcion escribeSaludo de la clase main
		Pr0Main.escribeSaludo("Julio Dominguez");
		
		//Creamos objeto de la clase FuncsMatematicas
		FuncsMatematicas nuevo = new FuncsMatematicas();
		//Probamos código 
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <=i ; j++) 
				System.out.print(nuevo.combinatorio(i, j) + " ");
			System.out.println();
		}
	}
}
