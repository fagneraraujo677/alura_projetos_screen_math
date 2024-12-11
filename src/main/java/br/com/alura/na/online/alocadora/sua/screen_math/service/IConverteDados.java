package br.com.alura.na.online.alocadora.sua.screen_math.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
