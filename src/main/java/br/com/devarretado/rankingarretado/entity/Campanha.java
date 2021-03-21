package br.com.devarretado.rankingarretado.entity;

import java.util.Map;

import br.com.devarretado.rankingarretado.enums.Posicao;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Campanha {
	
	private Map<String, Posicao> competicoes;
	
}
