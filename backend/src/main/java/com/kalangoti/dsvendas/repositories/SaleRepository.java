package com.kalangoti.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalangoti.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
