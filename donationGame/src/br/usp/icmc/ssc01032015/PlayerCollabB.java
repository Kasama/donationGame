package br.usp.icmc.ssc01032015;

public class PlayerCollabB extends Player {

	@Override
	public double declareDonationTo(Competitor c) {
		if(c.toString().equals("ATheNewSoN"))
			return 9.99;
		else
			return 0;
	}

	@Override
	public String toString(){
		return "Denilso";
	}
}
