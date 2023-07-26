import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner in= new Scanner(System.in);
			    System.out.println("Calculamos tu descuento del boleto de acuerdo a tu edad, digitala por favor:");
			    int edad= in.nextInt();
			    float descuento;
			    if (edad>=60) {
			    	descuento=(7-(7*(0.55F)));
			    	System.out.println("El descuento es de 55%, tu boleto costará: "+descuento+ "Euros");
			    }else if(edad<=5) {
			    	descuento=(7-(7*(0.60F)));
			    	System.out.println("El porcentaje es de 60%, tu boleto costará: "+descuento+ "Euros");
			    }else
			    	System.out.println("No tienes edad para un descuento");
			in.close();
	}

}
