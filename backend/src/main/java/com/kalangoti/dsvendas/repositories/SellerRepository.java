package com.kalangoti.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalangoti.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
