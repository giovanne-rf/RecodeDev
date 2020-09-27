package br.com.hermes.excecoes;


public class numeroInvalidoException extends RuntimeException{

    private String numeroProcesso;

    public numeroInvalidoException(String numeroProcesso){
        this.numeroProcesso = numeroProcesso;
    }

    @Override
    public String getMessage() {
        return String.format("O numero do processso '%s' está incorreto!" ,
                numeroProcesso);
    }
}
