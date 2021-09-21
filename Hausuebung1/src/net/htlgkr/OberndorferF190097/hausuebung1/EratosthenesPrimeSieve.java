package net.htlgkr.OberndorferF190097.hausuebung1;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private int o;

    public EratosthenesPrimeSieve(int o) {
        this.o = o;
    }
    
    @Override
    public boolean isPrime(int p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printPrimes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean[] getGestrichen(){
        boolean gestrichen[] = new boolean[o+1];
        
        
        for(int i = 2;i<gestrichen.length;i++){
            if(!gestrichen[i]){
                for(int j = 0;j<o;j++){
                    int x = i*i;
                    if(x == j){
                        gestrichen[j] = true;
                        x = x+i;
                    }
                }
            }
        }
        return gestrichen;
    }
}
