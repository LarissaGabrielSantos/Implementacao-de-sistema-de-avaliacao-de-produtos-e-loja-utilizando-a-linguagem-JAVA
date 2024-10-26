package com.exemplo.avaliacoes.repository;

import com.exemplo.avaliacoes.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findByProduto(String produto);

	List<Avaliacao> findAll();
}
