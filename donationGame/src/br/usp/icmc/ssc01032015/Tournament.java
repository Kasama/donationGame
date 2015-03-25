package br.usp.icmc.ssc01032015;

import java.util.ArrayList;

public class Tournament {
	
	private int rounds;
	private int[] numberOfPlayers;
	private ArrayList<Player> players;
	
	public Tournament(int rounds, int[] numberOfPlayers){
		
		this.rounds = rounds;
		this.numberOfPlayers = numberOfPlayers;
		players = new ArrayList<Player>();
		int k = 0;
		for(int i = 0; i < numberOfPlayers.length; i++){
			for(int j = 0; j < numberOfPlayers[i];j++){
				players.add(getPlayer(i+1, k++));
			}
		}
	}
	
	public Player getPlayer(int strategy, int id){
		
		switch(strategy){
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
		}
		return null;
		
	}
	
	public Player startTournament(){
		
		return null;
	}
	
	public void encounter(Player p1, Player p2){
		
		double p1Donation;
		double p2Donation;
		
		p1Donation = p1.declareDonationTo(p2);
		p2Donation = p2.declareDonationTo(p1);

		p1.informDonationFrom(p2, p2Donation);
		p2.informDonationFrom(p1, p1Donation);
		
		p1.addCash((10d - p1Donation) + 2*(p2Donation));
		p2.addCash((10d - p2Donation) + 2*(p1Donation));
		
		
	}
	
	public void round(){
		
	}
	


}
