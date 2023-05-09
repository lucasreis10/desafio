package com.desafio.desafio.domain.membro;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class MembroId implements Serializable {

    private Long idProjeto;

    private Long idPessoa;


}
