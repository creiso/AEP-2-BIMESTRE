package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlockChainTest {

    public BlockChainTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCriarBlockchain() {
        Bloco pessoaa = new Bloco();
        assertNotNull(pessoaa, "Objeto do tipo Bloco criado!");
    }

    public void testCriarBlockchainDois() {
        Bloco pessoaa = new Bloco();
        pessoaa.adicionar("Fernando Santana, 07/09/1997, 114.218.369-63, Castro, Paraná, Brasil");
        assertNotNull(pessoaa, "Parâmetros passados para objeto do tipo Bloco!");
    }

}
