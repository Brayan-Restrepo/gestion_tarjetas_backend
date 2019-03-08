package com.ibm.tarjeta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.tarjeta.models.entity.Tarjeta;

@Repository
public interface TarjetaRepository extends CrudRepository<Tarjeta, String> {

}
