package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class BloodData {
    private String tipo;
    private String signo;
public BloodData(){
    
}
public BloodData(String a,String b){
    tipo=a;
    signo=b;
    
}


public void settipo(String a){
    tipo=a;
    
}
public String gettipo(){
    return tipo;
}
public void setsigno(String n){
    signo=n;
}
public String getsigno(){
    return signo;
}
 public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        BloodData a=new BloodData();
        System.out.println("Que tipo de sangre eres?");
        String tipo=teclado.next();
        System.out.println("Que signo eres?");
        String signo=teclado.next();
        a.setsigno(tipo);
        System.out.println(a.gettipo()+ " "+ a.getsigno() );
        BloodData b=new BloodData(tipo,signo);
        System.out.println(a.gettipo()+ " "+ a.getsigno() );
        
    
}
    
}
