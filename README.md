# RankingNordestinho

## Projeto dedicado a gerar vários tipos de Ranking dos times do Nordeste.

### Como contribuir para o projeto:

- Para contribuir adicionando as campanhas dos clubes basta você editar o arquivo: src/main/resources/static/clubes.json
É um arquivo json simples com essa estrutura:
{
    "clubes":[
        {
            "nome":"Nome do clube",
            "temporadas":[
                {
                    "ano":2011,
                    "campanha":
                        {
                            "Estadual":"PRIMEIRA_POSICAO", 
                            "CopaDoNordeste":"NAO_PARTICIPOU",
                            "SerieA":"DECIMA_OITAVA_POSICAO",
                            "SerieB":"NAO_PARTICIPOU",
                            "SerieC":"NAO_PARTICIPOU",
                            "SerieD":"NAO_PARTICIPOU",
                            "CopaDoBrasil":"SEMI_FINAL",
                            "CopaSulAmericana":"SEGUNDA_FASE",
                            "Libertadores":"NAO_PARTICIPOU"
                        }
                }
            ]
          }
    ]
}
Por favor, colocar as temporadas em ordem crescente: 2011, 2012, 2013 e assim vai. O nome das competições tem que está escrito dessa forma, caso contrário não irá funcionar.

- Os clibes no json estão agrupados por Estado, por favor mantenha desta forma.

### Posições e fases de cada competição:

### Copa do Brasil
###### NAO_PARTICIPOU
###### FASE_PRELIMINAR
###### PRIMEIRA_FASE
###### SEGUNDA_FASE
###### TERCEIRA_FASE
###### QUARTA_FASE(Depois de 2016)
###### OITAVAS_DE_FINAL
###### QUARTAS_DE_FINAL
###### SEMI_FINAL
###### SEGUNDA_POSICAO
###### PRIMEIRA_POSICAO

### Copa do NE
###### NAO_PARTICIPOU
###### FASE_PRELIMINAR
###### FASE_DE_GRUPOS
###### QUARTAS_DE_FINAL
###### SEMI_FINAL
###### SEGUNDA_POSICAO
###### PRIMEIRA_POSICAO


### Taça Libertadores da américa
###### NAO_PARTICIPOU
###### PRIMEIRA_FASE
###### SEGUNDA_FASE
###### TERCEIRA_FASE
###### FASE_DE_GRUPOS
###### OITAVAS_DE_FINAL
###### QUARTAS_DE_FINAL
###### SEMI_FINAL
###### SEGUNDA_POSICAO
###### PRIMEIRA_POSICAO

### Copa Sul Americana
###### NAO_PARTICIPOU
###### PRIMEIRA_FASE
###### SEGUNDA_FASE
###### TERCEIRA_FASE
###### FASE_DE_GRUPOS
###### OITAVAS_DE_FINAL
###### QUARTAS_DE_FINAL
###### SEMI_FINAL
###### SEGUNDA_POSICAO
###### PRIMEIRA_POSICAO

### Série A, Série B, Série C, Série D, Estaduais
###### NAO_PARTICIPOU
###### PRIMEIRA_POSICAO,
###### SEGUNDA_POSICAO,
###### TERCEIRA_POSICAO,
###### QUARTA_POSICAO,
###### QUINTA_POSICAO,
###### SEXTA_POSICAO,
###### SETIMA_POSICAO,
###### OITAVA_POSICAO,
###### NONA_POSICAO,
###### DECIMA_POSICAO,
###### DECIMA_PRIMEIRA_POSICAO,
###### DECIMA_SEGUNDA_POSICAO,
###### DECIMA_TERCEIRA_POSICAO,
###### DECIMA_QUARTA_POSICAO,
###### DECIMA_QUINTA_POSICAO,
###### DECIMA_SEXTA_POSICAO,
###### DECIMA_SETIMA_POSICAO,
###### DECIMA_OITAVA_POSICAO,
###### DECIMA_NONA_POSICAO,
###### VIGESIMA_POSICAO,
###### VIGESIMA_PRIMEIRA_POSICAO,
###### VIGESIMA_SEGUNDA_POSICAO,
###### VIGESIMA_TERCEIRA_POSICAO,
###### VIGESIMA_QUARTA_POSICAO_EM_DIANTE,
