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
        boolean gestrichen[] = getGestrichen();
        
        if(!gestrichen[p]){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void printPrimes() {
        boolean gestrichen[] = getGestrichen();
        
        for(int i = 2;i<gestrichen.length;i++){
            if(!gestrichen[i]){
                System.out.println(i);
            }
        }
    }
    
    public boolean[] getGestrichen(){
        boolean gestrichen[] = new boolean[o+1];
        
        for(int i = 2;i<gestrichen.length;i++){
            if(!gestrichen[i]){
                int x = i*i;
                for(int j = 0;j<o;j++){
                    if(x == j){
                        gestrichen[j] = true;
                        x = x+i;
                    }
                }
            }
        }
        gestrichen[0] = true;
        gestrichen[1] = true;
        return gestrichen;
    }
    
    public void ngPrimeCalculation(){
        int ng[] = new int[o/2-1];
        boolean gestrichen[] = getGestrichen();
        List<String> primeNumbers = new ArrayList<>();
        
        for(int i = 0;i<gestrichen.length;i++){
            if(!gestrichen[i]){
                primeNumbers.add(Integer.toString(i)); //Primzahlen speichern
            }
        }
        
        int ngZahl = 4;
        for(int i = 0;i<ng.length;i++){ //ng Zahlen festlegen
            ng[i] = ngZahl;
            ngZahl = ngZahl + 2;
        }
        
        
        for(int i = 0;i<ng.length;i++){
            int ngNumber = ng[i];
            for(int j = 0;j<primeNumbers.size();j++){
                for(int x = 0;x<primeNumbers.size();x++){
                    if(ngNumber == Integer.parseInt(primeNumbers.get(j))+Integer.parseInt(primeNumbers.get(x))){
                        System.out.println(ngNumber + "summe: "+ngNumber + " = " + Integer.parseInt(primeNumbers.get(j)) + " + " + Integer.parseInt(primeNumbers.get(x)));
                    }
                }
            }
        }
    }
}
