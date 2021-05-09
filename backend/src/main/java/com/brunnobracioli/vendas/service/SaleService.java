package com.brunnobracioli.vendas.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brunnobracioli.vendas.dto.SaleDTO;
import com.brunnobracioli.vendas.entities.Sale;
import com.brunnobracioli.vendas.repositories.SaleRepository;
import com.brunnobracioli.vendas.repositories.SellerRepository;

//registra a classe SellerService sendo um componente do sistema, dessa forma esse componente pode ser injetado em outros componentes
@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll(); // cria um cache para o banco de dados ao realizar a consulta fazer apenas uma vez a consulta de vendendores
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x)); // converte uma coleção original para uma nova coleção de outro tipo
	}

}
