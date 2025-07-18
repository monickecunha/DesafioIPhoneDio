package com.desafioDio;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("iPhone: Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("iPhone: Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("iPhone: Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("iPhone: Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("iPhone: Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iPhone: Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("iPhone: Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("iPhone: Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("iPhone: Página atualizada.");
    }
}
