package com.kalangoti.dsvendas.dtos;

import java.io.Serializable;

import com.kalangoti.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {

	// Boa medida para garantir que seja convertido para bytes e possa ser trafegado
	// em rede e ser salvo em arquivo.
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long visited;
	private Long deals;

	public SaleSuccessDTO() {
		super();
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		super();
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
}
