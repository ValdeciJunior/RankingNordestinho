package br.com.devarretado.rankingarretado.model;

import java.math.BigDecimal;

import br.com.devarretado.rankingarretado.enums.Posicao;
import br.com.devarretado.rankingarretado.service.CalculaBrasileirao;

public class SerieA{
	private static BigDecimal primeiroLugar = BigDecimal.valueOf(800);
	
	public static BigDecimal pontuacao(Posicao posicao) {
		BigDecimal pontuacao = CalculaBrasileirao.pontuacao(primeiroLugar, posicao);
		return pontuacao;
	}
}
