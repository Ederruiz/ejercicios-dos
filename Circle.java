package ejercicios2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class Circle {
    private Double radio;
    private Double diameter;
    private Double area;
public Circle(){
    radio=1.0;
    diameter=radio*2;
    area=Math.PI*pow(radio,2);
} 
public void setradio(Double a){
    radio=a;
    diameter=radio*2;
    area=Math.PI*pow(radio,2);    
}
public Double getradio(){
    return radio;
    
}
public Double getdiameter(){
    return diameter;
}
public Double getarea(){
    return area;
}
public String toString(){
    String mensaje="El diametro es: "+diameter+"\nEl area es: "+area;
    return mensaje;
}
public static void main(String[] args){
    Scanner teclado=new Scanner(System.in);
    Circle a=new Circle();
    System.out.println("Ingrese el radio del circulo");
    double radio=teclado.nextDouble();
    a.setradio(radio);
    System.out.println(a.toString());
}
    
    
}
