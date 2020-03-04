


public class ContarPares {

private static final int CERO = 0;


public static void main(String[] args) {        
             
int contadorPares = calculaNumPareshastaN(10);
System.out.println("Hay "+contadorPares+" números de pares del 0 al 10");
System.out.println("FIn del programa");
System.out.println("FIn del programa2");	
	
System.out.println("FIn del programa3 DESDE GITHUB !!");
}

private static int calculaNumPareshastaN(int n) {
	int contadorPares=CERO;
	for (int i=CERO; i<=n;i++ )
	  {
	    if (i%2==CERO)
		contadorPares++;
	  }
	return contadorPares;
}
}
