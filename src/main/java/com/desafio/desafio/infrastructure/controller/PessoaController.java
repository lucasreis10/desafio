package com.desafio.desafio.infrastructure.controller;

import com.desafio.desafio.application.pessoa.PessoaService;
import com.desafio.desafio.domain.pessoa.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.awt.print.Book;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/viewPessoa")
    public String viewBooks(Model model) {
        model.addAttribute("pessoas", pessoaService.getPessoas());
        return "view-pessoa";
    }

    @GetMapping("/addBook")
    public String addBookView(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @PostMapping("/addBook")
    public RedirectView addBook(@ModelAttribute("book") Pessoa pessoa, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/book/addBook", true);
        Pessoa pessoaSalva = pessoaService.addPessoa(pessoa);
        redirectAttributes.addFlashAttribute("savedBook", pessoaSalva);
        redirectAttributes.addFlashAttribute("addBookSuccess", true);
        return redirectView;
    }
}
