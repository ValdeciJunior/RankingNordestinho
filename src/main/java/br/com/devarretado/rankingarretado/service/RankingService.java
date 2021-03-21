package br.com.devarretado.rankingarretado.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.devarretado.rankingarretado.entity.RankingClub;
import br.com.devarretado.rankingarretado.entity.Ranking;
import br.com.devarretado.rankingarretado.entity.SortRankingClube;
import br.com.devarretado.rankingarretado.entity.Temporada;
import br.com.devarretado.rankingarretado.model.CopaDoBrasil;
import br.com.devarretado.rankingarretado.model.CopaDoBrasilAntiga;
import br.com.devarretado.rankingarretado.model.CopaDoNordeste;
import br.com.devarretado.rankingarretado.model.CopaSulAmericana;
import br.com.devarretado.rankingarretado.model.Estadual;
import br.com.devarretado.rankingarretado.model.Libertadores;
import br.com.devarretado.rankingarretado.model.ResponseClubes;
import br.com.devarretado.rankingarretado.model.SerieA;
import br.com.devarretado.rankingarretado.model.SerieB;
import br.com.devarretado.rankingarretado.model.SerieC;
import br.com.devarretado.rankingarretado.model.SerieD;

@Service
public class RankingService {
	
	public Ranking decada2010() throws FileNotFoundException, IOException, ParseException {
		ResponseClubes clubes = getClubes();
		Ranking ranking = new Ranking();
		clubes.getClubes().forEach(clube ->{
			System.out.println("================== "+clube.getNome()+" ====================");
			ranking.getClubes().add(RankingClub.builder().nomeClub(clube.getNome()).pontuacao(calculoPontos(clube.getTemporadas().stream().filter(t -> t.getAno() >= 2011 && t.getAno() < 2021).collect(Collectors.toList()))).build());
		});
		Collections.sort(ranking.getClubes(), new SortRankingClube().reversed());
		return ranking;
	}
	
	public Ranking rankingAtual() throws FileNotFoundException, IOException, ParseException {
		ResponseClubes clubes = getClubes();
		Ranking ranking = new Ranking();
		Integer anoInicio = (LocalDate.now().getYear()) - 1;
		Integer anoFim = anoInicio - 4;
		
		clubes.getClubes().forEach(clube ->{
			System.out.println("================== "+clube.getNome()+" ====================");
			ranking.getClubes().add(RankingClub.builder().nomeClub(clube.getNome()).pontuacao(calculoPontosPeso(clube.getTemporadas().stream().filter(t -> t.getAno() >= anoFim && t.getAno() <= anoInicio).collect(Collectors.toList()))).build());
		});
		Collections.sort(ranking.getClubes(), new SortRankingClube().reversed());
		return ranking;
	}
	
	private ResponseClubes getClubes() throws IOException {
		String json = String.join(" ",Files.readAllLines(Paths.get("src/main/resources/static/clubes.json"),StandardCharsets.UTF_8));
		return new Gson().fromJson(json, ResponseClubes.class);
	}

	private BigDecimal calculoPontos(List<Temporada> temporadas) {
		BigDecimal pontuacao = BigDecimal.ZERO;
		for(Temporada t : temporadas){
			System.out.println("--- "+t.getAno()+" ---");
			BigDecimal pontuacaoTemporada = BigDecimal.ZERO;
			pontuacaoTemporada = pontuacaoTemporada.add(SerieD.pontuacao((t.getCampanha().get("SerieD"))));
			pontuacaoTemporada = pontuacaoTemporada.add(SerieC.pontuacao((t.getCampanha().get("SerieC"))));
			pontuacaoTemporada = pontuacaoTemporada.add(SerieB.pontuacao((t.getCampanha().get("SerieB"))));
			pontuacaoTemporada = pontuacaoTemporada.add(SerieA.pontuacao((t.getCampanha().get("SerieA"))));
			pontuacaoTemporada = pontuacaoTemporada.add(Estadual.pontuacao((t.getCampanha().get("Estadual"))));
			pontuacaoTemporada = pontuacaoTemporada.add(CopaDoNordeste.pontuacao((t.getCampanha().get("CopaDoNordeste"))));
			if (t.getAno() <= 2016) {
				pontuacaoTemporada = pontuacaoTemporada.add(CopaDoBrasilAntiga.pontuacao((t.getCampanha().get("CopaDoBrasil"))));
			}else {
				pontuacaoTemporada = pontuacaoTemporada.add(CopaDoBrasil.pontuacao((t.getCampanha().get("CopaDoBrasil"))));
			}
			pontuacaoTemporada = pontuacaoTemporada.add(CopaSulAmericana.pontuacao((t.getCampanha().get("CopaSulAmericana"))));
			pontuacaoTemporada = pontuacaoTemporada.add(Libertadores.pontuacao((t.getCampanha().get("Libertadores"))));
			pontuacao = pontuacao.add(pontuacaoTemporada);
			System.out.println(pontuacaoTemporada+" \n");
		}
		return pontuacao;
	}
	
	private BigDecimal calculoPontosPeso(List<Temporada> temporadas) {
		Integer peso = 1;
		BigDecimal pontuacao = BigDecimal.ZERO;
		for(Temporada t : temporadas){
			System.out.println("--- "+t.getAno()+" ---");
			BigDecimal pontuacaoTemporada = BigDecimal.ZERO;
			pontuacaoTemporada = pontuacaoTemporada.add(SerieD.pontuacao((t.getCampanha().get("SerieD"))));
			pontuacaoTemporada = pontuacaoTemporada.add(SerieC.pontuacao((t.getCampanha().get("SerieC"))));
			pontuacaoTemporada = pontuacaoTemporada.add(SerieB.pontuacao((t.getCampanha().get("SerieB"))));
			pontuacaoTemporada = pontuacaoTemporada.add(SerieA.pontuacao((t.getCampanha().get("SerieA"))));
			pontuacaoTemporada = pontuacaoTemporada.add(Estadual.pontuacao((t.getCampanha().get("Estadual"))));
			pontuacaoTemporada = pontuacaoTemporada.add(CopaDoNordeste.pontuacao((t.getCampanha().get("CopaDoNordeste"))));
			if (t.getAno() <= 2016) {
				pontuacaoTemporada = pontuacaoTemporada.add(CopaDoBrasilAntiga.pontuacao((t.getCampanha().get("CopaDoBrasil"))));
			}else {
				pontuacaoTemporada = pontuacaoTemporada.add(CopaDoBrasil.pontuacao((t.getCampanha().get("CopaDoBrasil"))));
			}
			pontuacaoTemporada = pontuacaoTemporada.add(CopaSulAmericana.pontuacao((t.getCampanha().get("CopaSulAmericana"))));
			pontuacaoTemporada = pontuacaoTemporada.add(Libertadores.pontuacao((t.getCampanha().get("Libertadores"))));
			pontuacaoTemporada = pontuacaoTemporada.multiply(BigDecimal.valueOf(peso));
			pontuacao = pontuacao.add(pontuacaoTemporada);
			System.out.println(pontuacaoTemporada+" \n");
			peso ++;
		}
		return pontuacao;
	}

}
