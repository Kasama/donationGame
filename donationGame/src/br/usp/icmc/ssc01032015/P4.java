package br.usp.icmc.ssc01032015;

public class P4 extends Player implements Competitor{

    @Override
    public double declareDonationTo(Competitor c){

        return 4;
    }
    
    @Override
    public String toString() {
        return "FOUR";
    }

}
