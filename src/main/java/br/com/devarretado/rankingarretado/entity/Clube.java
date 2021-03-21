package br.com.devarretado.rankingarretado.entity;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Clube {
	
	private String nome;
	private List<Temporada> temporadas;
}
