package br.com.devarretado.rankingarretado.entity;

import java.math.BigDecimal;

import br.com.devarretado.rankingarretado.enums.Escopo;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Competicao {
	
	private String nome;
	private Integer anoInicio;
	private Integer anoFim;
	private BigDecimal pontuacaoMaxima;
	private Escopo escopo;

}
