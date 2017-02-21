package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class Patient {
    private Integer id;
    private Integer edad;
    private BloodData sangre;
    
public Patient(Integer a,Integer b,String s, String n){
    id=a;
    edad=b;
    sangre=new BloodData(s,n);
    
}    

 public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el id del paciente");
        int id=teclado.nextInt();
        System.out.println("Ingresa la edad del paciente");
        int edad=teclado.nextInt();
        System.out.println("Que tipo de sangre eres?");
        String tipo=teclado.next();
        System.out.println("Que signo eres?");
        String signo=teclado.next();
        Patient paciente=new Patient(id,edad,tipo,signo);
       
        
    
}    
}
