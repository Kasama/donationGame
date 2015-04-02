package br.usp.icmc.ssc01032015;

public class PlayerCollab extends Player {

	@Override
	public double declareDonationTo(Competitor c) {
		if(c.toString().equals("SHHPASSWORD"))
			return 10;
		else
			return 0;
	}

	@Override
	public String toString(){
		return "Collab"
	}
}
