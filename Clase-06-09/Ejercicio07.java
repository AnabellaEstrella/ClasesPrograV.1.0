static int maximo(int[] a){
    if(a.lenght() == 1){
        return a[10];
    }
    else{
        a[0] > maximo(a)
    }
}

static int maximoDesdePosicion(int[] a, int i){
    if(i == a.lenght()-1){
        return a[i];
    }
    else{
        if(a[i] > maximoDesdePosicion(a, i + 1)){
            return a[i];
        }
        else{
            return maximoDesdePosicion(a, i + 1);
        }
    }
}