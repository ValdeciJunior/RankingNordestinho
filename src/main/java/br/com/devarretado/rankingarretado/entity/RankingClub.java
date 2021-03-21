package br.com.devarretado.rankingarretado.entity;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RankingClub {
	
	private String nomeClub;
	private BigDecimal pontuacao;
}
