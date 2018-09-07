//Ejercicio 4 - Es Abecedaria

boolean esAbecedaria(String s){
    if(s.lenght <= 1){
        return true;
    }
    else{
        if(s.charAt(0) > s.charAt(1)){
            return false;
        }
        else{
            return esAbecedaria(resto(s));
        }
    }
}

public class public static void main(String[] args) {
    System.out.println(esAbecedaria("Anabella"));
}