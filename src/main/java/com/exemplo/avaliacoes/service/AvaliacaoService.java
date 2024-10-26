package com.exemplo.avaliacoes.service;

import com.exemplo.avaliacoes.model.Avaliacao;
import com.exemplo.avaliacoes.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
