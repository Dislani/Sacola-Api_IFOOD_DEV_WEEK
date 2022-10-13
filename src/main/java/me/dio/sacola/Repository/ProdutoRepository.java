package me.dio.sacola.Repository;

import me.dio.sacola.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*A camada repository comporta classes especiais (interface's), que são capazes de  se comunicar com o banco de dados
através do JpaRepository. O JpaRepository possui metodos auxiliadores para busca de informações no banco  de dados.*/

@Repository                                              //tabela //primaryKEY
public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}
