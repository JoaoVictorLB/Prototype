package test.java.prototype;

import main.java.prototype.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro("Vermelho", "KPW-1872", "2019", new Fabricante("VW", "Alemã"));

        Carro carroClone = carro.clone();
        carroClone.setCor("Azul");
        carroClone.setPlaca("KWU-8090");
        carroClone.getFabricante().setNome("Bugatti");

        assertEquals("Carro{cor=Vermelho, placa='KPW-1872', ano=2019, fabricante='Fabricante{nome='VW', nacionalidade=Alemã}'}", carro.toString());
        assertEquals("Carro{cor=Azul, placa='KWU-8090', ano=2019, fabricante='Fabricante{nome='Bugatti', nacionalidade=Alemã}'}", carroClone.toString());
    }
}
