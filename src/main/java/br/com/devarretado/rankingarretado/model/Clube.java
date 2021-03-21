package br.com.devarretado.rankingarretado.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Clube {
	
	private String nome;
	private List<Temporada> temporadas;
	private double totalPontos;
	
}
