package com.desafioDio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutte
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        System.out.println("Testando Reprodutor Musical no iPhone");
        meuIphone.selecionarMusica("Paradise - Coldplay");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println();

        System.out.println("Testando Aparelho Telefônico no iPhone");
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("Testando Navegador de Internet no iPhone");
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}