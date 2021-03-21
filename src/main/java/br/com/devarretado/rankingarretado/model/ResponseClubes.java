package br.com.devarretado.rankingarretado.model;

import java.util.List;

import br.com.devarretado.rankingarretado.entity.Clube;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseClubes {
	
	private List<Clube> clubes;

}
