package br.usp.icmc.ssc01032015;

public class PlayerCollabC extends Player {

	@Override
	public double declareDonationTo(Competitor c) {
		if(c.toString().equals("ATheNewSoN"))
			return 9.98;
		else
			return 0;
	}

	@Override
	public String toString(){
		return "Adenilsoum";
	}
}
