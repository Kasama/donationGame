package br.usp.icmc.ssc01032015;

public class PlayerCollabD extends Player {

	private Competitor master;

	@Override
	public double declareDonationTo(Competitor c) {
		if(c.equals(master))
			return 9.9999;
		else
			return 0;
	}

	@Override
	public String toString(){
		return "Adenilson";
	}

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		if (donation ==	0.000000000000000893675669267420d)
			master = c;
	}
}
