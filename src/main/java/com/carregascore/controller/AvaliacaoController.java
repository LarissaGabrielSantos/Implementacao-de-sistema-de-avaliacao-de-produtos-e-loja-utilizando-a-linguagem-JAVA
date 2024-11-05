package com.carregascore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carregascore.model.Avaliacao;
import com.carregascore.service.AvaliacaoService;

@Controller
@RequestMapping("/avaliacoes")
public class AvaliacaoController {
	@Autowired
	private AvaliacaoService service;

	@GetMapping("/listagem")
	public String listarAvaliacoes(Model model) {
		List<Avaliacao> avaliacoes = service.listarTodas();
		model.addAttribute("avaliacoes", avaliacoes);
		return "avaliacoes";
	}

	@GetMapping("/nova")
	public String novaAvaliacao(Model model) {
		model.addAttribute("avaliacoes", new Avaliacao());
		return "formAvaliacao";
	}

	@PostMapping("/salvar")
	public String salvarAvaliacao(@ModelAttribute Avaliacao avaliacoes, Model model) {
		service.salvar(avaliacoes);
		return "redirect:/avaliacoes/listagem";
	}

}
