package main.java.prototype;

public class Carro implements Cloneable {
    private String cor;
    private String placa;
    private String ano;
    private Fabricante fabricante;

    public Carro(String cor, String placa, String ano, Fabricante fabricante){
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        Carro carroClone = (Carro) super.clone();
        carroClone.fabricante = (Fabricante) carroClone.fabricante.clone();
        return carroClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor=" + cor +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
