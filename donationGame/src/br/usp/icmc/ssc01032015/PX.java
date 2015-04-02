package br.usp.icmc.ssc01032015;

import java.util.Random;

public class PX extends Player implements Competitor{

    @Override
    public double declareDonationTo(Competitor c){

        Random rand = new Random();
        int randomNum = rand.nextInt((10) + 1);
        
        return randomNum;
    }
    
    @Override
    public String toString() {
        return "RANDOM";
    }

}
