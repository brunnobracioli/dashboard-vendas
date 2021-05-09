package com.brunnobracioli.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunnobracioli.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
