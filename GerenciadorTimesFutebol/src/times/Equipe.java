package times;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipe<Equipe> {

    private Long idTime;
    private String nomeTime;
    private LocalDate dataCriacao;
    private String corUniformePrincipal;
    private String corUniformeSecundario;
    List<times.Equipe> equipe = new ArrayList<>();

    public Equipe(Long idTime,
                  String nomeTime,
                  LocalDate dataCriacao,
                  String corUniformePrincipal,
                  String corUniformeSecundario) {

        this.idTime = idTime;
        this.nomeTime = nomeTime;
        this.dataCriacao = dataCriacao;
        this.corUniformePrincipal = corUniformePrincipal;
        this.corUniformeSecundario = corUniformeSecundario;
    }
}
