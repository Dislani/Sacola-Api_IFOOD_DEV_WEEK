package me.dio.sacola.Repository;

import me.dio.sacola.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*A camada repository comporta classes especiais (interface's), que são capazes de  se comunicar com o banco de dados
através do JpaRepository. O JpaRepository possui metodos auxiliadores para busca de informações no banco  de dados.*/

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
