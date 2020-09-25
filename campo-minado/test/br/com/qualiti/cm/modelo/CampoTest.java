package br.com.qualiti.cm.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampoTest {

    private Campo campo;

    @BeforeEach
    void iniciarCampo (){
        campo = new Campo( 3, 3);
    }

    @Test
    void adicionarVizinhoEsquerda() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }
    @Test
    void adicionarVizinhoDireita() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
        void adicionarVizinhoCima() {
        Campo vizinho = new Campo(2,3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }
    @Test
        void adicionarVizinhoBaixo() {
        Campo vizinho = new Campo(4,3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
        void adicionarDiagonal() {
        Campo vizinho = new Campo(2,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void adicionarNaoVizinho() {
        Campo vizinho = new Campo(5,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertFalse(resultado);
    }


}