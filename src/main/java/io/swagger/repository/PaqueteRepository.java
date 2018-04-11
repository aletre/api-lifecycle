package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Paquete;

public interface PaqueteRepository extends JpaRepository<Paquete, String> {

}
