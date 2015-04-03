package br.usp.icmc.ssc01032015;

public class PFred extends Player {

	private double lastDonation = 0;
	
	@Override
	public void informDonationFrom(Competitor c, double donation){
		this.lastDonation = donation;
	}
	@Override
	public double declareDonationTo(Competitor c) {
		return lastDonatinRecived(c);
	}

	@Override
	public String toString() {
		return "Fred";
	}
}
