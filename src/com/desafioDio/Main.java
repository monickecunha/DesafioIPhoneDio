package com.desafioDio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Testando Reprodutor Musical");
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        reprodutor.selecionarMusica("Minha Música Favorita");
        reprodutor.tocar();
        reprodutor.pausar();
        System.out.println();

        System.out.println("Testando Aparelho Telefônico");
        IPhone telefone = new AparelhoTelefonicoImpl();
        telefone.ligar("123-456-7890");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("Testando Navegador de Internet");
        NavegadorInternet navegador = new NavegadorInternetImpl();
        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

    }
}