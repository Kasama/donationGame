package br.usp.icmc.ssc01032015;

public class PFred extends Player {

	@Override
	public double declareDonationTo(Competitor c) {
		return lastDonatinRecived(c);
	}

	private double lastDonatinRecived(Competitor c){
		if(this.ammounts.isEmpty()) 
			return 0d;
		else
			return this.ammounts.get(this.ammounts.size() - 1);
	}

	@Override
	public String toString() {
		return "Fred";
	}
}
