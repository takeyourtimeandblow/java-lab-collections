package org.example;

import java.util.ArrayList;

public class PrimesGenerator {
    static ArrayList generate(final int N){
        ArrayList arr = new ArrayList();
        int count=0;

        for(int j=1;j<=N;j++){
            for(int i = 1; i <= j; i++){
                if(j%i == 0){
                    count++;
                }
            }
            if(j==1){
                arr.add(j);
            }
            if(count==2){
                arr.add(j);
            }
            count=0;
        }
        return arr;
    }


}
