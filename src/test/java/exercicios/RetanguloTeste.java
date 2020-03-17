package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    private Retangulo r1;

    @BeforeEach
    public void beforeEach(){
        r1 = new Retangulo();
        r1.setBase(10d);
        r1.setAltura(20d);
    }

    @AfterEach
    public void afterEach(){
        r1 = null;
    }
    @Test
    public void criarObjetoConta(){
        assertNotNull(r1);
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(r1.getBase());
        assertNotNull(r1.getAltura());
    }
    @Test
    public void metodoCalculoArea(){
        Double valorEsperado = 200.0;
        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado,valorObtido);
    }
    @Test
    public void metodoCalcularPerimetro(){
        Double valorEsperado = 60.0;
        Double valorObtido = r1.calcularPerimentro();
        assertEquals(valorEsperado,valorObtido);
    }
}
