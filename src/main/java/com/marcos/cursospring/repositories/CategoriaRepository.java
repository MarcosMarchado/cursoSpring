package com.marcos.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursospring.domain.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
//Segundo parametro é o atributo indentificador
}
