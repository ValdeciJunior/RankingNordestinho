//package br.com.devarretado.rankingarretado;
//
//import java.util.Arrays;
//
//import br.com.devarretado.rankingarretado.model.Clube;
//import br.com.devarretado.rankingarretado.model.CopaDoBrasil;
//import br.com.devarretado.rankingarretado.model.CopaDoBrasilAntiga;
//import br.com.devarretado.rankingarretado.model.CopaDoNordeste;
//import br.com.devarretado.rankingarretado.model.CopaSulAmericana;
//import br.com.devarretado.rankingarretado.model.Estadual;
//import br.com.devarretado.rankingarretado.model.Libertadores;
//import br.com.devarretado.rankingarretado.model.SerieA;
//import br.com.devarretado.rankingarretado.model.SerieB;
//import br.com.devarretado.rankingarretado.model.SerieC;
//import br.com.devarretado.rankingarretado.model.SerieD;
//import br.com.devarretado.rankingarretado.model.Temporada;
//
//public class Teste {
//	
//	static double pontos = 0;
//	
//
//	public static void main(String[] args) {
//		
//		Clube ceara = Clube.builder()
//				.totalPontos(0)
//				.nome("Ceará")
//				.temporadas(Arrays.asList(
//						Temporada.builder().ano("2011").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.SEMI_FINAL), 
//								new SerieA(SerieA.DECIMA_OITAVA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.SEGUNDA_FASE),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2012").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.SEGUNDA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.DECIMA_PRIMEIRA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2013").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.SEMI_FINAL),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.SEGUNDA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.SETIMA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2014").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.VICE_CAMPECAO),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.OITAVAS_DE_FINAL), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.OITAVA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2015").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO),
//								new CopaDoNordeste(CopaDoNordeste.CAMPEAO),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.OITAVAS_DE_FINAL), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.DECIMA_QUINTA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2016").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.NAO_PARTICIPOU),
//								new CopaDoNordeste(CopaDoNordeste.QUARTAS_DE_FINAL),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.TERCEIRA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.DECIMA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2017").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasil(CopaDoBrasil.PRIMEIRA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.TERCEIRA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2018").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.SEMI_FINAL),
//								new CopaDoBrasil(CopaDoBrasil.TERCEIRA_FASE), 
//								new SerieA(SerieA.DECIMA_QUINTA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2019").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO	),
//								new CopaDoNordeste(CopaDoNordeste.QUARTAS_DE_FINAL),
//								new CopaDoBrasil(CopaDoBrasil.TERCEIRA_FASE), 
//								new SerieA(SerieA.DECIMA_SEXTA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2020").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO),
//								new CopaDoNordeste(CopaDoNordeste.CAMPEAO),
//								new CopaDoBrasil(CopaDoBrasil.QUARTAS_DE_FINAL), 
//								new SerieA(SerieA.DECIMA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build()
//				))
//		.build();
//		
//		Clube fortaleza = Clube.builder()
//				.totalPontos(0)
//				.nome("Fortaleza")
//				.temporadas(Arrays.asList(
//						Temporada.builder().ano("2011").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.NAO_PARTICIPOU),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.SEGUNDA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.DECIMA_TERCEIRA_POSICAO), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU	),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2012").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.OITAVAS_DE_FINAL), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.QUINTA_POSICAO), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2013").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.QUARTO_COLOCADO),
//								new CopaDoNordeste(CopaDoNordeste.SEMI_FINAL),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.TERCEIRA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NONA_POSICAO), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2014").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.NAO_PARTICIPOU), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.QUINTA_POSICAO), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2015").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.QUARTAS_DE_FINAL),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.SEGUNDA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.QUINTA_POSICAO), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2016").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.QUARTAS_DE_FINAL),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.OITAVAS_DE_FINAL), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.SEXTA_POSICAO), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2017").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.TERCEIRO_COLOCADO),
//								new CopaDoNordeste(CopaDoNordeste.FASE_DE_GRUPOS),
//								new CopaDoBrasil(CopaDoBrasil.PRIMEIRA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.SEGUNDA_POSICAO), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2018").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasil(CopaDoBrasil.NAO_PARTICIPOU), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.PRIMEIRA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2019").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.CAMPEAO),
//								new CopaDoBrasil(CopaDoBrasil.OITAVAS_DE_FINAL), 
//								new SerieA(SerieA.NONA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2020").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.SEMI_FINAL),
//								new CopaDoBrasil(CopaDoBrasil.OITAVAS_DE_FINAL), 
//								new SerieA(SerieA.DECIMA_QUARTA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.PRIMEIRA_FASE),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build()
//				))
//		.build();
//		
//		Clube bahia = Clube.builder()
//				.totalPontos(0)
//				.nome("Bahia")
//				.temporadas(Arrays.asList(
//						Temporada.builder().ano("2011").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.TERCEIRO_COLOCADO),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.OITAVAS_DE_FINAL), 
//								new SerieA(SerieA.DECIMA_QUARTA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2012").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.NAO_PARTICIPOU),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.QUARTAS_DE_FINAL), 
//								new SerieA(SerieA.DECIMA_QUINTA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.SEGUNDA_FASE),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2013").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO),
//								new CopaDoNordeste(CopaDoNordeste.FASE_DE_GRUPOS),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.SEGUNDA_FASE), 
//								new SerieA(SerieA.DECIMA_SEGUNDA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.OITAVAS_DE_FINAL),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2014").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.FASE_DE_GRUPOS),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.TERCEIRA_FASE), 
//								new SerieA(SerieA.DECIMA_OITAVA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.OITAVAS_DE_FINAL),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2015").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.VICE_CAMPECAO),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.TERCEIRA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.NONA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.SEGUNDA_FASE),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2016").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO),
//								new CopaDoNordeste(CopaDoNordeste.SEMI_FINAL),
//								new CopaDoBrasilAntiga(CopaDoBrasilAntiga.SEGUNDA_FASE), 
//								new SerieA(SerieA.NAO_PARTICIPOU), 
//								new SerieB(SerieB.QUARTA_POSICAO), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2017").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.VICE_CAMPECAO),
//								new CopaDoNordeste(CopaDoNordeste.CAMPEAO),
//								new CopaDoBrasil(CopaDoBrasil.SEGUNDA_FASE), 
//								new SerieA(SerieA.DECIMA_SEGUNDA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.NAO_PARTICIPOU),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2018").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.VICE_CAMPECAO),
//								new CopaDoBrasil(CopaDoBrasil.QUARTAS_DE_FINAL), 
//								new SerieA(SerieA.DECIMA_PRIMEIRA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.QUARTAS_DE_FINAL),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2019").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.FASE_DE_GRUPOS),
//								new CopaDoBrasil(CopaDoBrasil.QUARTAS_DE_FINAL), 
//								new SerieA(SerieA.DECIMA_PRIMEIRA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.PRIMEIRA_FASE),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build(),
//						
//						Temporada.builder().ano("2020").competicompeticoes(Arrays.asList(
//								new Estadual(Estadual.CAMPEAO),
//								new CopaDoNordeste(CopaDoNordeste.VICE_CAMPECAO),
//								new CopaDoBrasil(CopaDoBrasil.PRIMEIRA_FASE), 
//								new SerieA(SerieA.DECIMA_SEXTA_POSICAO), 
//								new SerieB(SerieB.NAO_PARTICIPOU), 
//								new SerieC(SerieC.NAO_PARTICIPOU), 
//								new SerieD(SerieD.NAO_PARTICIPOU),
//								new CopaSulAmericana(CopaSulAmericana.QUARTAS_DE_FINAL),
//								new Libertadores(Libertadores.NAO_PARTICIPOU))).build()
//				))
//		.build();
//		
//		ceara.getTemporadas().forEach(t ->{
//			t.getCompeticompeticoes().forEach(c ->{
//				ceara.setTotalPontos(ceara.getTotalPontos() + c.getTotalPontos());
//			});
//		});
//		
//		fortaleza.getTemporadas().forEach(t ->{
//			t.getCompeticompeticoes().forEach(c ->{
//				fortaleza.setTotalPontos(fortaleza.getTotalPontos() + c.getTotalPontos());
//				System.out.println(c.getTotalPontos());
//			});
//			System.out.println("---------------------------------------------------------------");
//		});
//		
//		bahia.getTemporadas().forEach(t ->{
//			t.getCompeticompeticoes().forEach(c ->{
//				bahia.setTotalPontos(bahia.getTotalPontos() + c.getTotalPontos());
//			});
//		});
//		
//		System.out.println(ceara.getNome()+" - "+ceara.getTotalPontos());
//		System.out.println(fortaleza.getNome()+" - "+fortaleza.getTotalPontos());
//		System.out.println(bahia.getNome()+" - "+bahia.getTotalPontos());
//	}
//
//}
