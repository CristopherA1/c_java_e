import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
	    System.out.println("Calculamos tu comisión de acuerdo a tu rango de ventas el cual tienes que digitar:");
	    double rango= in.nextDouble();
	    double resultado;
	    if (rango>=10_000) {
	    	resultado=(rango*(0.30));
	    	System.out.println("El porcentaje es de 30%, tu ganacia en comisiones es: "+resultado+ "$");
	    }else if(rango>=5001) {
	    	resultado=(rango*(0.20));
	    	System.out.println("El porcentaje es de 20%, tu ganacia en comisiones es: "+resultado+ "$");
	    }else if(rango>=1001) {
	    	resultado=(rango*(0.10));
	    	System.out.println("El porcentaje es de 10%, tu ganacia en comisiones es: "+resultado+ "$");
	    }else 
	    	System.out.println("No generaste ninguna comisión");
	in.close();
	}//Main

}//Ejercicio1
