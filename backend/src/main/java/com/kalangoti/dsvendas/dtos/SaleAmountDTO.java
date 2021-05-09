package com.kalangoti.dsvendas.dtos;

import java.io.Serializable;

import com.kalangoti.dsvendas.entities.Seller;

public class SaleAmountDTO implements Serializable {

	// Boa medida para garantir que seja convertido para bytes e possa ser trafegado
	// em rede e ser salvo em arquivo.
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Double sum;

	public SaleAmountDTO() {
		super();
	}

	public SaleAmountDTO(Seller seller, Double sum) {
		super();
		sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
