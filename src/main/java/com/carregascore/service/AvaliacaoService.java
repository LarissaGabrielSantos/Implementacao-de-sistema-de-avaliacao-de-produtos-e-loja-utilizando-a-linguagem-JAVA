package com.carregascore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carregascore.model.Avaliacao;
import com.carregascore.repository.AvaliacaoRepository;

@Service
public class AvaliacaoService {

	@Autowired
	private AvaliacaoRepository repository;

	public List<Avaliacao> listarTodas() {
		return repository.findAll();
	}

	public Avaliacao salvar(Avaliacao avaliacao) {
		return repository.save(avaliacao);
	}

	public List<Avaliacao> buscarPorProduto(String produto) {
		return repository.findByProduto(produto);
	}
}
