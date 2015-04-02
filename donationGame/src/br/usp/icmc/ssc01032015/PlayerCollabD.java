package br.usp.icmc.ssc01032015;

public class PlayerCollabD extends Player {

	@Override
	public double declareDonationTo(Competitor c) {
		if(c.toString().equals("ATheNewSoN"))
			return 9.97;
		else
			return 0;
	}

	@Override
	public String toString(){
		return "Adenilsou";
	}
}
