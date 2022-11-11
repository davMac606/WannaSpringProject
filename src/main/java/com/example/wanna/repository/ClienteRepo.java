package com.example.wanna.repository;
import com.example.wanna.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepo extends JpaRepository<Cliente, Integer>{

    @Query(value="SELECT c FROM Cliente c WHERE c.codigo = ?1")
    public List<Cliente> findByCodigo (int codigo);

    @Query(value="SELECT c FROM Cliente c WHERE c.nome LIKE ?1")
    public List<Cliente> findByNome (String nome);

    @Query(value="SELECT c FROM Cliente c WHERE c.email LIKE ?1")
    public List<Cliente> findByEmail (String email);

    @Query(value="SELECT c FROM Cliente c WHERE c.nome LIKE %?1%")
    public List<Cliente> findByInicial (String nome);

    @Query(value="SELECT c FROM Cliente c WHERE c.codigo > ?1")
    public List<Cliente> findByCodigoMaior (int codigo);

    @Query(value="SELECT c FROM Cliente c WHERE c.email LIKE %?1%")
    public List<Cliente> findByParteEmail (String email);

    @Query(value="SELECT c FROM Cliente c WHERE c.nome LIKE %?1% AND c.email LIKE %?2%")
    public List<Cliente> findByNomeEmail (String nome, String email);

}
