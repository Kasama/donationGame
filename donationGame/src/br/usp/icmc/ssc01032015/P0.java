package br.usp.icmc.ssc01032015;

public class P0 extends Player implements Competitor{

    @Override
    public double declareDonationTo(Competitor c){

        return 0;
    }

    @Override
    public String toString() {
        return "ZERO";
    }
}
