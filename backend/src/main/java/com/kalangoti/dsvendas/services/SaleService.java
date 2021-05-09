package com.kalangoti.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kalangoti.dsvendas.dtos.SaleDTO;
import com.kalangoti.dsvendas.entities.Sale;
import com.kalangoti.dsvendas.repositories.SaleRepository;
import com.kalangoti.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerrepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerrepository.findAll();// Evitando interações repetidas ao banco de dados
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
