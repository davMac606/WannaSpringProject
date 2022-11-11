package com.example.wanna.repository;

import com.example.wanna.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProdutoRepo extends JpaRepository<Produto, Integer> {

    @Query(value = "SELECT p FROM Produto p WHERE p.codigo LIKE ?1")
    public List<Produto> findByCodigo(int codigo);

    @Query(value = "SELECT p FROM Produto p WHERE p.descricao LIKE %?1%")
    public List<Produto> findByDesc(String descricao);

    @Query(value = "SELECT p FROM Produto p WHERE p.marca LIKE %?1%")
    public List<Produto> findByMarca(String marca);

    @Query(value = "SELECT p FROM Produto p WHERE p.preco > ?1")
    public List<Produto> findByPrecoMaior(float preco);

    @Query(value = "SELECT p FROM Produto p WHERE p.preco < ?1")
    public List<Produto> findByPrecoMenor(float preco);

    @Query(value = "SELECT p FROM Produto p WHERE p.descricao LIKE %?1% AND p.marca LIKE %?2%")
    public List<Produto> findByDescAndMarca(String descricao, String marca);

    @Query(value = "SELECT p FROM Produto p WHERE p.descricao LIKE ?1 AND p.preco < ?2")
    public List<Produto> findByDescAndPreco(String descricao, float preco);

    /*@Query(value = "UPDATE p FROM Produto SET p.descricao = ?1, p.marca = ?2, p.preco = ?3 WHERE u.codigo = ?4")
    public void atualizar(String descricao, String  marca, float preco, int codigo);
    */


}
