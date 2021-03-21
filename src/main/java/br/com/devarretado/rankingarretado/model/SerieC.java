package br.com.devarretado.rankingarretado.model;

import java.math.BigDecimal;

import br.com.devarretado.rankingarretado.enums.Posicao;
import br.com.devarretado.rankingarretado.service.CalculaBrasileirao;

public class SerieC{
	private static BigDecimal primeiroLugar = BigDecimal.valueOf(200);
	
	public static BigDecimal pontuacao(Posicao posicao) {
		return CalculaBrasileirao.pontuacao(primeiroLugar, posicao);
	}

}
