package br.com.qualiti.cm.modelo;

import br.com.qualiti.cm.excecao.ExplosaoException;
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

    @Test
    void MarcacaoPadrao (){
        assertFalse(campo.isMarcado());
    }

    @Test
    void alternarMarcacao (){
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void alternarMarcacaoDuasChamadas (){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }

    @Test
    void abrirCampoNaoMinadoNaoMarcado (){
        assertTrue(campo.abrir());
    }

    @Test
    void abrirCampoNaoMinadoMarcado (){
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }

    @Test
    void abrirCampoMinadoMarcado (){
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }


    @Test
    void abrirCampoMinadoNaoMarcado (){
        campo.minar();
        assertThrows(ExplosaoException.class, ()->{
            campo.abrir();
        });
    }

    @Test
    void testeAbrirComVizinhos1(){
        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2,2);
         campo22.adicionarVizinho(campo11);
         campo.adicionarVizinho(campo22);
         campo.abrir();
         assertTrue(campo22.isAberto() && campo11.isAberto());
    };

    @Test
    void testeAbrirComVizinhos2(){
        Campo campo11 = new Campo(1,1);
        Campo campo12 = new Campo(1,1);
        campo12.minar();

        Campo campo22 = new Campo(2,2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);

        campo.adicionarVizinho(campo22);
        campo.abrir();
        assertTrue(campo22.isAberto() && campo11.isFechado());
    };



}