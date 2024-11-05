package com.carregascore.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Avaliacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String nomeCliente;
	private String produto;
	private String comentario;
	private int nota;

	private LocalDateTime dataCriacao = LocalDateTime.now();

	public Avaliacao(Long id, String nomeCliente, String produto, String comentario, int nota,
			LocalDateTime dataCriacao) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.produto = produto;
		this.comentario = comentario;
		this.nota = nota;
		this.dataCriacao = dataCriacao;
	}

	public Avaliacao() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "Avaliacao [id=" + id + ", nomeCliente=" + nomeCliente + ", produto=" + produto + ", comentario="
				+ comentario + ", nota=" + nota + ", dataCriacao=" + dataCriacao + "]";
	}

}
