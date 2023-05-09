package com.desafio.desafio.domain.projeto;

import com.desafio.desafio.domain.pessoa.Pessoa;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_previsao_fim")
    private LocalDate dataPrevisaoFim;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(length = 5000)
    private String descricao;

    @Column(length = 45)
    private String status;

    @Column
    private Float orcamento;

    @Column(length = 45)
    private String risco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idgerente", nullable = false)
    private Pessoa gerente;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataPrevisaoFim() {
        return dataPrevisaoFim;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public Float getOrcamento() {
        return orcamento;
    }

    public String getRisco() {
        return risco;
    }

    public Pessoa getGerente() {
        return gerente;
    }
}
