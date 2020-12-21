package com.marcos.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursospring.domain.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
//Segundo parametro é o atributo indentificador
}
