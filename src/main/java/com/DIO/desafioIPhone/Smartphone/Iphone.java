package com.DIO.desafioIPhone.Smartphone;

public class Iphone implements Telefone, ReprodutorMusical, NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("Exibindo página");
    }

    public void adicionarPagina() {
        System.out.println("Adicionando página");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void fecharPagina() {
        System.out.println("Fechando página");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada telefônica");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
