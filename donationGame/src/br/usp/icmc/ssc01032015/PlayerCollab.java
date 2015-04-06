package br.usp.icmc.ssc01032015;

public class PlayerCollab extends Player {

	private Competitor master = null;

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		if (donation ==	0.000000000000000000893675669267420d && master == null)
			master = c;
	}

	@Override
	public String toString(){
		//Todos os nomes sao ficticios e meremente ilustrativos
		//Qualquer semelhanca com a realidade e' mera coincidencia
		return "Collab";
	}
}
