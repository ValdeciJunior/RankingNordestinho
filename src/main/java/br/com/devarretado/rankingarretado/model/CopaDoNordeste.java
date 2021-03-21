package br.com.devarretado.rankingarretado.model;

import java.math.BigDecimal;

import br.com.devarretado.rankingarretado.enums.Posicao;

public class CopaDoNordeste {
	
	private static BigDecimal primeiroLugar = BigDecimal.valueOf(300);
	
	public static BigDecimal pontuacao(Posicao posicao) {
		return calculoPontuacao(posicao);
	}

	private static BigDecimal calculoPontuacao(Posicao posicao) {
		BigDecimal pontuacao = BigDecimal.ZERO;
		switch (posicao){
		case FASE_PRELIMINAR:
			pontuacao = BigDecimal.valueOf(40);
			break;
		
		case FASE_DE_GRUPOS:
			pontuacao = BigDecimal.valueOf(105);
			break;
			
		case QUARTAS_DE_FINAL:
			pontuacao = BigDecimal.valueOf(210);
			break;
			
		case SEMI_FINAL:
			pontuacao = BigDecimal.valueOf(225);
			break;
			
		case SEGUNDA_POSICAO:
			pontuacao = BigDecimal.valueOf(240);
			break;
			
		case PRIMEIRA_POSICAO:
			pontuacao = primeiroLugar;
			break;
			
		default:
			pontuacao = BigDecimal.ZERO;
		}
		return pontuacao;
	}

}
