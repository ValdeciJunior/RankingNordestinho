package br.com.devarretado.rankingarretado.service;

import java.math.BigDecimal;

import br.com.devarretado.rankingarretado.enums.Posicao;

public class CalculaBrasileirao {

	public static BigDecimal pontuacao(BigDecimal pontuacaoMaxima, Posicao posicao) {
		BigDecimal pontuacao = BigDecimal.ZERO;
		switch (posicao){
		case PRIMEIRA_POSICAO:
			pontuacao = pontuacaoMaxima;
			break;
			
		case SEGUNDA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.8));
			break;
			
		case TERCEIRA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.75));
			break;
			
		case QUARTA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.7));
			break;
			
		case QUINTA_POSICAO:
			pontuacao =  pontuacaoMaxima.abs().multiply(BigDecimal.valueOf(0.69));
			break;
			
		case SEXTA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.68));
			break;
			
		case SETIMA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.67));
			break;
			
		case OITAVA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.66));
			break;
			
		case NONA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.65));
			break;
			
		case DECIMA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.64));
			break;
			
		case DECIMA_PRIMEIRA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.63));
			break;
			
		case DECIMA_SEGUNDA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.62));
			break;
			
		case DECIMA_TERCEIRA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.61));
			break;
			
		case DECIMA_QUARTA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.6));
			break;
			
		case DECIMA_QUINTA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.59));
			break;
			
		case DECIMA_SEXTA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.58));
			break;
			
		case DECIMA_SETIMA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.57));
			break;
			
		case DECIMA_OITAVA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.56));
			break;
			
		case DECIMA_NONA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.55));
			break;
			
		case VIGESIMA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.54));
			break;

		case VIGESIMA_PRIMEIRA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.53));
			break;
			
		case VIGESIMA_SEGUNDA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.52));
			break;
			
		case VIGESIMA_TERCEIRA_POSICAO:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.51));
			break;
			
		case VIGESIMA_QUARTA_POSICAO_EM_DIANTE:
			pontuacao =  pontuacaoMaxima.multiply(BigDecimal.valueOf(0.51));
			break;
			
		default:
			pontuacao = BigDecimal.ZERO;
		}
		return pontuacao;
	}
}
