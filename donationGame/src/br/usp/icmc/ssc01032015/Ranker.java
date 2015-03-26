package br.usp.icmc.ssc01032015;

import java.util.Comparator;
class Ranker implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2){

		if(p1.getTotalCash() == p2.getTotalCash())
			return 0;
		else if(p1.getTotalCash() < p2.getTotalCash())
			return -1;
		else if(p1.getTotalCash() > p2.getTotalCash())
			return 1;
		return 0;
	}
	
}
