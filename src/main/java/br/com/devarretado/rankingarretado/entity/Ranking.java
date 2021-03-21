package br.com.devarretado.rankingarretado.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ranking {
	
	private List<RankingClub> clubes = new ArrayList<RankingClub>();

}
