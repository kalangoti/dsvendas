package com.kalangoti.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kalangoti.dsvendas.dtos.SaleAmountDTO;
import com.kalangoti.dsvendas.dtos.SaleSuccessDTO;
import com.kalangoti.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.kalangoti.dsvendas.dtos.SaleAmountDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleAmountDTO> amountGroupedBySeller();

	@Query("SELECT new com.kalangoti.dsvendas.dtos.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
