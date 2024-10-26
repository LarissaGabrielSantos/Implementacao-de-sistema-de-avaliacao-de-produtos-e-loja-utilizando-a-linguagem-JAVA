package com.exemplo.avaliacoes.controller;

import com.exemplo.avaliacoes.model.Avaliacao;
import com.exemplo.avaliacoes.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService service;

    @GetMapping
    public String listarAvaliacoes(Model model) {
        List<Avaliacao> avaliacoes = service.listarTodas();
        model.addAttribute("avaliacoes", avaliacoes);
        return "avaliacoes";
    }

    @GetMapping("/nova")
    public String novaAvaliacao(Model model) {
        model.addAttribute("avaliacao", new Avaliacao());
        return "formAvaliacao";
    }

    @PostMapping("/salvar")
    public String salvarAvaliacao(Avaliacao avaliacao) {
        service.salvar(avaliacao);
        return "redirect:/avaliacoes";
    }
}
