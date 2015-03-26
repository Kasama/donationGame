package br.usp.icmc.ssc01032015;

import java.util.ArrayList;

public class Player implements Competitor{

	double cash;
	ArrayList<Double> ammounts;
	
	public Player (){
		
		this.cash = 0;
		ammounts = new ArrayList<Double>();
		
	}
	
	@Override
	public double declareDonationTo(Competitor c) {
		return 10;
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

	@Override
	public String toString(){

		return "" + this.cash;

	}

}
