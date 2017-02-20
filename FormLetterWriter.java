package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class FormLetterWriter {
    private String apellido;
    private String nombre;

public FormLetterWriter(){
    
}
public void getapellido(String a){
    apellido=a;
}
public void getnombre(String b){
    nombre=b;
}
public void saludo(String s){
    nombre=s;
    System.out.println("Dear Mr. or Ms "+nombre);
    System.out.println("Thank you for your recent order");
}
public void saludo(String n,String m){
    apellido=n;
    nombre=m;
    System.out.println("Dear "+ nombre+" "+apellido);
    System.out.println("Thank you for your recent order");
}
public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    FormLetterWriter z=new FormLetterWriter();
    String a,b;
    System.out.println("Cual es su apellido");
    a=teclado.next();
    System.out.println("Cual es su nombre");
    b=teclado.next();
    z.saludo(a);
    z.saludo(a, b);
    
    
}
}
