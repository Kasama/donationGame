package br.usp.icmc.ssc01032015;

import java.util.ArrayList;

public class Player implements Competitor{

	double cash;
	int id;
	ArrayList<Double> ammounts;
	
	public Player (int id){
		
		this.id = id;
		this.cash = 0;
		
	}
	
	@Override
	public double declareDonationTo(Competitor c) {
		return 0;
	}

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		ammounts.add(donation);
		return;		
	}

	@Override
	public void addCash(double amount) {
		this.cash += amount;
	}

	@Override
	public double getTotalCash() {
		return this.cash;
	}

}
