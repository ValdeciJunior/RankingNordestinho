package br.com.devarretado.rankingarretado.model;

import java.util.List;

import br.com.devarretado.rankingarretado.interfaces.Competicao;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Temporada {
	
	private String ano;
	private List<Competicao> competicompeticoes;

}
