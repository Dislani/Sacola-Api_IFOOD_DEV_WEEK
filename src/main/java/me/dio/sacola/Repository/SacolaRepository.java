package me.dio.sacola.Repository;

import me.dio.sacola.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*A camada repository comporta classes especiais (interface's), que são capazes de  se comunicar com o banco de dados
através do JpaRepository. O JpaRepository possui metodos auxiliadores para busca de informações no banco  de dados.*/

@Repository                                           //tabela //primaryKEY
public interface SacolaRepository extends JpaRepository<Sacola, Long> {
}
