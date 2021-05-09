package com.brunnobracioli.vendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunnobracioli.vendas.dto.SellerDTO;
import com.brunnobracioli.vendas.entities.Seller;
import com.brunnobracioli.vendas.repositories.SellerRepository;

//registra a classe SellerService sendo um componente do sistema, dessa forma esse componente pode ser injetado em outros componentes
@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList()); // converte uma coleção original para uma nova coleção de outro tipo
	}

}
