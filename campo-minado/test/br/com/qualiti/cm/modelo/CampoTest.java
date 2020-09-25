package br.com.qualiti.cm.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampoTest {

    private Campo campo = new Campo(3, 3);

    @Test
    void adicionarVizinho() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }
}