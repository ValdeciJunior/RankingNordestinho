package br.com.devarretado.rankingarretado.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.devarretado.rankingarretado.entity.Ranking;
import br.com.devarretado.rankingarretado.service.RankingService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/ranking",produces = { MediaType.APPLICATION_JSON_VALUE })
public class RankingController {
	
	private final RankingService service;
	
	@GetMapping("/decada-2010")
	@ResponseBody
	public ResponseEntity<Ranking> rankingDecada2010() throws FileNotFoundException, IOException, ParseException{
		Ranking ranking = service.decada2010();
		return ResponseEntity.ok(ranking);
	}
	
	@GetMapping("/atual")
	@ResponseBody
	public ResponseEntity<Ranking> rankingAtual() throws FileNotFoundException, IOException, ParseException{
		Ranking ranking = service.rankingAtual();
		return ResponseEntity.ok(ranking);
	}
}
