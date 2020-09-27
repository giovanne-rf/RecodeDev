package br.com.hermes.excecoes;


public class numeroInvalidoException extends RuntimeException{

    private String numeroProcesso;

    public numeroInvalidoException(String numeroProcesso){
        this.numeroProcesso = numeroProcesso;
    }

    @Override
    public String getMessage() {
        return String.format("Processso '%s' inválido, verifique o formato " +
                        "correto - 1234567-12.1234.1.12.1234" ,
                numeroProcesso);
    }
}
