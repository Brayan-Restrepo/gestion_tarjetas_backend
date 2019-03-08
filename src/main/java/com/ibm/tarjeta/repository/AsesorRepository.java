package com.ibm.tarjeta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.tarjeta.models.entity.Asesor;

@Repository
public interface AsesorRepository extends CrudRepository<Asesor, String> {

}
