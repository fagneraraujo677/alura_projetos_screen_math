package br.com.alura.na.online.alocadora.sua.screen_math.principais;

import br.com.alura.na.online.alocadora.sua.screen_math.doMain.model.DadosDeSerie;
import br.com.alura.na.online.alocadora.sua.screen_math.doMain.model.DadosDeTemporada;
import br.com.alura.na.online.alocadora.sua.screen_math.service.ConsumoDeAPI;
import br.com.alura.na.online.alocadora.sua.screen_math.service.ConverterDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner leitor = new Scanner(System.in);
    private ConsumoDeAPI consumo = new ConsumoDeAPI();
    private ConverterDados conversor = new ConverterDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=9b7626b3";

    public void exibeMenu() {
        System.out.println("********** Digite o nome da série para busca: ");
        var nomeDaSerie = leitor.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeDaSerie.replace(" ", "+" + API_KEY));
        DadosDeSerie dados = conversor.obterDados(json, DadosDeSerie.class);
        System.out.println(dados);

        List<DadosDeTemporada> temporadas = new ArrayList<>();
        for (int i = 1; i < dados.totalTemporadas(); i++) {
            json = consumo.obterDados(ENDERECO + nomeDaSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosDeTemporada dadosTemporada = conversor.obterDados(json, DadosDeTemporada.class);
            temporadas.add(dadosTemporada);

        }
        temporadas.forEach(System.out::println);
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())) );

    }
}
