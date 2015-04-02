package br.usp.icmc.ssc01032015;

public class P10 extends Player implements Competitor{

    @Override
    public double declareDonationTo(Competitor c){

        return 10;
    }
    
    @Override
    public String toString() {
        return "TEN";
    }

}
