package com.marcos.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursospring.domain.Produto;;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
//Segundo parametro é o atributo indentificador
}
