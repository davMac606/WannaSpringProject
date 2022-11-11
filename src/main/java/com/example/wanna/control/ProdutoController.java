package com.example.wanna.control;

import com.example.wanna.model.Produto;
import com.example.wanna.repository.ProdutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepo proRep;

    @PostMapping(value="/inserirProduto")
    public void inserirProduto(@RequestBody Produto po) {
        proRep.save(po);
    }

    @DeleteMapping(value="/removerProduto")
    public void removerProduto(@RequestBody Produto po) {
        proRep.delete(po);
    }

    @GetMapping(value="/buscaGeral")
    public List<Produto> buscarTodos() {
        return proRep.findAll();
    }

    @GetMapping(value="/buscaCodigo/{codigo}")
    public List<Produto> listarCodigo(@PathVariable(value="codigo") int codigo) {
        return proRep.findByCodigo(codigo);
    }

    @GetMapping(value="/buscaDescricao/{descricao}")
    public List<Produto> listarDescricao(@PathVariable(value="descricao") String descricao) {
        return proRep.findByDesc(descricao);
    }

    @GetMapping(value="/buscaMarca/{marca}")
    public List<Produto> listarMarca(@PathVariable(value="marca") String marca) {
        return proRep.findByMarca(marca);
    }

    @GetMapping(value="/buscaPrecoMaior/{preco}")
            public List<Produto> listarPrecoMaior(@PathVariable(value="preco") float preco) {
        return proRep.findByPrecoMaior(preco);
    }

    @GetMapping(value="/buscaPrecoMenor/{preco}")
        public  List<Produto> listarPrecoMenor(@PathVariable(value="preco") float preco) {
        return proRep.findByPrecoMenor(preco);
    }

    @GetMapping(value="/buscaDescMarca/{descricao}/{marca}")
    public List<Produto> listarDescMarca(@PathVariable(value="descricao") String descricao, @PathVariable(value="marca") String marca) {
        return proRep.findByDescAndMarca(descricao, marca);
    }

    @GetMapping(value="/buscaDescPreco/{descricao}/{preco}")
    public List<Produto> listarDescPreco(@PathVariable(value="descricao") String descricao, @PathVariable(value="preco") float preco) {
        return proRep.findByDescAndPreco(descricao, preco);
    }

    @PutMapping(value="/atualizarProduto")
    public void atualizarProd(@RequestBody Produto po) {
        proRep.save(po);
    }

}
