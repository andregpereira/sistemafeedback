package com.bios.sistemafeedback.model;

import java.sql.Blob;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private Long idVeiculo;
	private String nome;
	private String sobrenome;
	private String email;
	private String identidade;
	private String estado;
	private String cidade;
	private String modeloVeiculo;
	private Long nrVeiculo;
	private Integer quilometragem;
	private Integer anoVeiculo;
	private String observacao;
	private Integer tempoTrabalhado;
	private LocalDate tempoPosse;
	private String origem;
	private String destino;
	private Blob anexo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public Long getNrVeiculo() {
		return nrVeiculo;
	}

	public void setNrVeiculo(Long nrVeiculo) {
		this.nrVeiculo = nrVeiculo;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}

	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Integer getTempoTrabalhado() {
		return tempoTrabalhado;
	}

	public void setTempoTrabalhado(Integer tempoTrabalhado) {
		this.tempoTrabalhado = tempoTrabalhado;
	}

	public LocalDate getTempoPosse() {
		return tempoPosse;
	}

	public void setTempoPosse(LocalDate tempoPosse) {
		this.tempoPosse = tempoPosse;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Blob getAnexo() {
		return anexo;
	}

	public void setAnexo(Blob anexo) {
		this.anexo = anexo;
	}

}
