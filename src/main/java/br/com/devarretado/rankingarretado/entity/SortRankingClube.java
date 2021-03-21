package br.com.devarretado.rankingarretado.entity;

import java.util.Comparator;

public class SortRankingClube implements Comparator<RankingClub>{

	@Override
	public int compare(RankingClub a, RankingClub b) {
		return a.getPontuacao().compareTo(b.getPontuacao());
	}

}
