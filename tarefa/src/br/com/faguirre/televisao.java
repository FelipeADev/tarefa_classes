package br.com.faguirre;

public class televisao {

    private String nome;

    private String modelo;

    private int tamanhoPolegadas;

    private String resolucao;

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String setModelo(String modelo) {
        this.modelo = modelo;
        return modelo;
    }

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public int setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
        return tamanhoPolegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public String setResolucao(String resolucao) {
        this.resolucao = resolucao;
        return resolucao;
    }

    public String retornarNome() {
        return "Samsung";
    }

    //Imprimindo na tela as especificações

    public static void main(String args[]) {
        televisao televisao = new televisao();
        System.out.println(televisao.setTamanhoPolegadas(60));
        System.out.println(televisao.setModelo("Samsung"));
        System.out.println(televisao.setNome("TV FullHD"));
        System.out.println(televisao.setResolucao("1990 x 1080p"));
    }

}
