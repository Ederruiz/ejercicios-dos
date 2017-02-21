package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class TestBirdSighting {
    
    public static void main(String[] args){
        Scanner teclado=new Scanner (System.in);
        BirdSighting a=new BirdSighting();
        System.out.println("Que dia es?");
        int dia=teclado.nextInt();
        System.out.println("Cuantos pajaros haz visto?");
        int numero=teclado.nextInt();
        a.setdia(dia);
        a.setnumero(numero);      
        System.out.println(a.getespcie()+" "+ a.getnumero()+ " "+ a.getdia());
        BirdSighting b=new BirdSighting("robin",dia,numero);
        System.out.println(a.getespcie()+" "+ a.getnumero()+ " "+ a.getdia());
    }
    
    
}
