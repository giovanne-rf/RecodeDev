package times;

import MeuTimeInterface.MeuTimeInterface;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class gerenciadorTime implements MeuTimeInterface {

    private Long idTime;
    private String nomeTime;
    private LocalDate dataCriacao;
    private String corUniformePrincipal;
    private String corUniformeSecundario;

    Long idJogador;
    String nomeJogador;
    LocalDate dataNascimento;
    Integer nivelHabilidade;
    BigDecimal salario;
    Boolean capitao;



    @Override
    public void incluirTime(Long id,
                            String nome,
                            LocalDate dataCriacao,
                            String corUniformePrincipal,
                            String corUniformeSecundario) {

        Equipe equipeNova = new Equipe(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
        equipeNova.equipe.add(equipeNova);
    }

    @Override
    public void incluirJogador(Long idJogador,
                               Long idTime,
                               String nomeJogador,
                               LocalDate dataNascimento,
                               Integer nivelHabilidade,
                               BigDecimal salario) {
        this.idJogador = idJogador;
        this.idTime = idTime;
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
        this.nivelHabilidade = nivelHabilidade;
        this.salario = salario;
    }

    @Override
    public void definirCapitao(Long idJogador) {
            this.capitao = true;

    }

    @Override
    public Long buscarCapitaoDoTime(Long idTime) {
        return null;
    }

    @Override
    public String buscarNomeJogador(Long idJogador) {
        return null;
    }

    @Override
    public String buscarNomeTime(Long idTime) {
        return null;
    }

    @Override
    public Long buscarJogadorMaiorSalario(Long idTime) {
        return null;
    }

    @Override
    public BigDecimal buscarSalarioDoJogaodor(Long idJogador) {
        return null;
    }

    @Override
    public List<Long> buscarJogadoresDoTime(Long idTime) {
        return null;
    }

    @Override
    public Long buscarMelhorJogadorDoTime(Long idTime) {
        return null;
    }

    @Override
    public Long buscarJogadorMaisVelho(Long idTime) {
        return null;
    }

    @Override
    public List<Long> buscarTimes() {
        return null;
    }

    @Override
    public List<Long> buscarTopJogadores(Integer top) {
        return null;
    }
}
