package com.desafio.desafio.domain.membro;

import com.desafio.desafio.domain.pessoa.Pessoa;
import com.desafio.desafio.domain.projeto.Projeto;
import jakarta.persistence.*;

@Entity
@Table(name = "membros")
public class Membro {

    @EmbeddedId
    private MembroId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idProjeto")
    private Projeto projeto;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idPessoa")
    private Pessoa pessoa;

    public MembroId getId() {
        return id;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
