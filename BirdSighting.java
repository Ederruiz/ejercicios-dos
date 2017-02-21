package ejercicios2;

/**
 *
 * @author Eder
 */
public class BirdSighting {
    private String especie;
    private Integer numero;
    private Integer dia;
public BirdSighting(){
    especie="robin";
    numero=1;
    dia=1;
}    
public BirdSighting(String s,Integer a,Integer b){
    especie=s;
    numero=a;
    dia=b;
    
    
}
public void setespcie(String b){
    especie=b;
    
}
public String getespcie(){
    return especie;
    
}
public void setnumero(Integer a){
    numero=a; 
}
public Integer getnumero(){
    return numero;
}
public void setdia(Integer a){
    dia=a; 
}
public Integer getdia(){
    return dia;
}
    
}
