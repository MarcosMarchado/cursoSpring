package com.marcos.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursospring.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
//Segundo parametro é o atributo indentificador
}
