package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlocoTest {

    private Informacao a;
    private String novoValor;
    private Informacao primeiro;
    private Informacao ultimo;

    public BlocoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {

    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @org.junit.jupiter.api.Test
    public void testAdicionar() {
        a = new Informacao(novoValor);
        assertNotNull(a, "Objeto criado com sucesso!");

    }

    public void testAdicionarDois() {

        Informacao novoInformacao = new Informacao(novoValor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoInformacao;
            this.ultimo = novoInformacao;
        }
        assertNotNull(this.primeiro, "Não é nulo.");
        assertNotNull(this.ultimo, "Não é nulo.");

    }

}
