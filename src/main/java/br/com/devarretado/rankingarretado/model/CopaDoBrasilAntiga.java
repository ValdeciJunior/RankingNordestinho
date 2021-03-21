package br.com.devarretado.rankingarretado.model;

import java.math.BigDecimal;

import br.com.devarretado.rankingarretado.enums.Posicao;

public class CopaDoBrasilAntiga{
	
	private static double primeiroLugar = 600;
	
	public static BigDecimal pontuacao(Posicao posicao) {
		return calculoPontuacao(posicao);
	}
	
	private static BigDecimal calculoPontuacao(Posicao posicao) {
		double pontuacao = 0;
		switch (posicao){
		case PRIMEIRA_FASE:
			pontuacao =  25;
			break;
			
		case SEGUNDA_FASE:
			pontuacao =  50;
			break;
			
		case TERCEIRA_FASE:
			pontuacao =  100;
			break;
			
		case OITAVAS_DE_FINAL:
			pontuacao =  200;
			break;
			
		case QUARTAS_DE_FINAL:
			pontuacao =  400;
			break;
			
		case SEMI_FINAL:
			pontuacao =  450;
			break;
			
		case SEGUNDA_POSICAO:
			pontuacao =  480;
			break;
			
		case PRIMEIRA_POSICAO:
			pontuacao = primeiroLugar;
			break;
			
		case NAO_PARTICIPOU:
			pontuacao = 0;
			break;
			
		default:
			pontuacao = 0;
		}
		return BigDecimal.valueOf(pontuacao);
	}

}
