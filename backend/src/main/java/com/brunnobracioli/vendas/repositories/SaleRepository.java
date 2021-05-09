package com.brunnobracioli.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunnobracioli.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
