package br.com.devarretado.rankingarretado.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Regiao {
	
	NORTE("Norte"),
	NORDESTE("Nordeste"),
	SUL("Sul"),
	SUDESTE("Sudeste"),
	CENTRO_OESTE("Centro-oeste");
	
	private String nome;
}
