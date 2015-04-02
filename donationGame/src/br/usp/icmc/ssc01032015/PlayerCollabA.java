package br.usp.icmc.ssc01032015;

public class PlayerCollabA extends Player {

	@Override
	public double declareDonationTo(Competitor c) {
		if(c.toString().equals("ATheNewSoN"))
			return 10;
		else
			return 0;
	}

	@Override
	public String toString(){
		return "Adenilson";
	}
}
