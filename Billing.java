package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class Billing {
    private Double libro;
    private Double cantidad;
    private Double cupon;
public Billing(){
    
}    
public Double computeBill (Double a){
    double total=0,impuesto=0;
    libro=a;
    impuesto=libro*0.08;
    total=libro+impuesto;
    return total;
    
}
public Double computeBill (Double a,Double b){
    libro=a;
    cantidad=b;
    double total=0,impuesto=0;
    impuesto=libro*0.08;
    total=cantidad*libro+impuesto;
    return total;
}
public Double computeBill (Double a,Double b,Double c){
    libro=a;
    cantidad=b;
    cupon=c;
    double total=0,impuesto=0;
    impuesto=libro*0.08;
    total=cantidad*libro+impuesto-cupon;
    return total;
}
public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
    System.out.println("Ingresa el precio del libro");
    double precio=teclado.nextDouble();
    
    
}
    
}
