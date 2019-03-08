package com.ibm.tarjeta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.tarjeta.models.entity.Consumo;

@Repository
public interface ConsumoRepository extends CrudRepository<Consumo, String> {

}
