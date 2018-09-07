/**
cantDivisores(6) --> 1, 2, 3, 6 --> 4
cantDivisores(7) --> 1, 7 --> 2
 */

static int cantDivisoresEnRango(int n, int s){
    if(s == n){
        if(n % s == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    else{
        if(n % s == 0){
            return 1 + cantDivisoresEnRango(n, s + 1);
        }
        else{
            return cantDivisoresEnRango(n, s + 1);
        }
    }
}

static int cantidadDeDivisores(int n){
    if(n == 1){
        return 1;
    }
    if(n == 0){
        return 0;
    }
    else{
        return cantidadDeDivisores()
    }
}