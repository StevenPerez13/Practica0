package tp.pr0;


public class FuncsMatematicas {
	public static int factorial (int n) {
		 //Declaro una variable long para guardas los resultados de los factoriales
		long resultado = 1;
		
		//Distingo si n distinto de 0 o 1, en caso de ser igual el resultado es 1
		if (n != 0 || n != 1 ) {
		
			//Calculo factorial
			for (int i = 1; i <= n; i++) {
				resultado = resultado*i;
			}
		}
		else {
			
			//Compruebo que el numero no sea negativo
			if (n == 0 || n ==1) { resultado = 1; //si no es negativo, devuelvo un 1
			}else { resultado = 0; //si es negativo, devuelvo un 0
			}
		}
		
		//Retorno el valor resultado, pero como es de tipo long lo convierto en int para poder retornarlo
		return (int) ((resultado));
	}
	public static int combinatorio (int n, int k) {
		//Declaro variables de tipo long para los factoriales de n, de k, de la resta de n-k y del resultado final
		long factn, factk, fact_resta, resultadofinal;
		
		//Calculo los factoriales de cada uno
		factn = factorial(n);
		factk = factorial(k);
		int resta = n-k;
		fact_resta = factorial(resta);
		
		//Cáclulo resultado final con los factoriales de todos
		resultadofinal = factn/(factk*fact_resta);
		
		//Retorno valor convertido en int
		return (int) ((resultadofinal));
	}
	
}
