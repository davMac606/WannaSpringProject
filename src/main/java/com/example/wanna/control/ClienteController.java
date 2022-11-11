package com.example.wanna.control;

import com.example.wanna.model.Cliente;
import com.example.wanna.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/apiCliente")
public class ClienteController {
    @Autowired
    ClienteRepo cliRep;

    @GetMapping(value="/buscaGeral")
    public List<Cliente> buscarTodos() {
        return cliRep.findAll();
    }

    @PostMapping(value="/inserirCliente")
    public void inserirCliente(@RequestBody Cliente cl) {
        cliRep.save(cl);
    }

    @DeleteMapping(value="/removerCliente")
    public void removerCliente(@RequestBody Cliente cl) {
        cliRep.delete(cl);
    }

    @GetMapping(value="/buscaCodigo/{codigo}")
    public List<Cliente> buscarCodigo(@PathVariable(value="codigo") int codigo) {
        return cliRep.findByCodigo(codigo);
    }

    @GetMapping(value="/buscaNome/{nome}")
    public List<Cliente> buscarNome(@PathVariable(value="nome") String nome) {
        return cliRep.findByNome(nome);
    }

    @GetMapping(value="/buscaEmail/{email}")
    public List<Cliente> buscarEmail(@PathVariable(value="email") String email) {
        return cliRep.findByEmail(email);
    }

    @GetMapping(value="/buscaInicial/{nome}")
    public List<Cliente> buscarInicial(@PathVariable(value="nome") String nome) {
        return cliRep.findByInicial(nome);
    }

    @GetMapping(value="/buscaCodigoMaior/{codigo}")
    public List<Cliente> buscaCodigoMaior(@PathVariable(value="codigo") int codigo) {
        return cliRep.findByCodigoMaior(codigo);
    }

    @GetMapping(value="/buscaParteEmail/{email}")
    public List<Cliente> buscaParteEmail(@PathVariable(value="email") String email) {
        return cliRep.findByParteEmail(email);
    }

    @GetMapping(value="/buscaNomeEmail/{nome}/{email}")
    public List<Cliente> buscaNomeEmail(@PathVariable(value="nome") String nome, @PathVariable(value="email") String email) {
        return cliRep.findByNomeEmail(nome, email);
    }

    @PutMapping(value="/atualizarCliente")
    public void atualizarCliente(@RequestBody Cliente cl) {
        cliRep.save(cl);
    }





}
