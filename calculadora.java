package calculadora;

public class calculadora {

	
	
	    public static double sumar(double n1, double n2) {
	    	return n1+n2;
 }
	   
	    
	    public static double restar(double n1, double n2) {
	    	return n1-n2;
}
	   
	    public static double dividir(double n1, double n2) { 
	    	if(n1==0 || n2==0) {
	    		return -1;
	    	}
	    	return n1/n2;
 }
	   
	    
	    public static double multiplicar(double n1, double n2) {
	    	return n1*n2;
}
	    public static void main(String[] args) {
			double resultado = calculadora.sumar(1,  2);
			System.out.println(resultado);
		}
}
