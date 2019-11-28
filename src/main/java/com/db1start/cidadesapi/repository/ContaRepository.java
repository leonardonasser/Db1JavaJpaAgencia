package com.db1start.cidadesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1start.cidadesapi.domain.entity.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

}
