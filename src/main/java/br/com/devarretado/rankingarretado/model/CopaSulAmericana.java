package br.com.devarretado.rankingarretado.model;

import java.math.BigDecimal;

import br.com.devarretado.rankingarretado.enums.Posicao;

public class CopaSulAmericana{
	
	private static BigDecimal primeiroLugar = BigDecimal.valueOf(900);
	
	public static BigDecimal pontuacao(Posicao posicao) {
		return calculoPontuacao(posicao);
	}

	private static BigDecimal calculoPontuacao(Posicao posicao) {
		BigDecimal pontuacao;
		switch (posicao){
		case NAO_PARTICIPOU:
			pontuacao = BigDecimal.ZERO;
			break;
			
		case PRIMEIRA_FASE:
			pontuacao = BigDecimal.valueOf(115);
			break;
			
		case SEGUNDA_FASE:
			pontuacao = BigDecimal.valueOf(225);
			break;
			
		case FASE_DE_GRUPOS:
			pontuacao = BigDecimal.valueOf(390);
			break;
			
		case OITAVAS_DE_FINAL:
			pontuacao = BigDecimal.valueOf(450);
			break;
			
		case QUARTAS_DE_FINAL:
			pontuacao = BigDecimal.valueOf(630);
			break;
			
		case SEMI_FINAL:
			pontuacao = BigDecimal.valueOf(675);
			break;
			
		case SEGUNDA_POSICAO:
			pontuacao = BigDecimal.valueOf(720);
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
