package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    private Correntista co1;

    @BeforeEach
    public void beforeEach(){
        co1 = new Correntista();
        co1.getCodigo(1);
        co1.setNome("Raimundo");
        co1.setEmail("Raimundo@Raimundo.com");
        co1.setTelefone("11111111111");
    }
    @AfterEach
    public void afterEach(){
        co1 = null;
    }

    @Test
    public void criarObjetoCorrentista(){
        assertNotNull(co1);
    }
    @Test
    public void criarAtributos(){
        assertNotNull(co1.getCodigoCliente());
    }

}
