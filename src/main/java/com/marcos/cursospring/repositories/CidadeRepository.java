package com.marcos.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursospring.domain.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
//Segundo parametro é o atributo indentificador
}
