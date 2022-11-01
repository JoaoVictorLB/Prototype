package main.java.prototype;

public class Fabricante implements Cloneable{
    private String nome;
    private String nacionalidade;

    public Fabricante(String nome, String nacionalidade) {
        super();
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nome='" + nome + '\'' +
                ", nacionalidade=" + nacionalidade +
                '}';
    }
}
