package br.usp.icmc.ssc01032015;

public interface Competitor {

	double declareDonationTo(Competitor c);
	void informDonationFrom(Competitor c, double donation);
	void addCash(double amount);
	double getTotalCash();
	
}
