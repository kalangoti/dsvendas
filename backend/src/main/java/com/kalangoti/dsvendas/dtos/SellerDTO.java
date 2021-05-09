package com.kalangoti.dsvendas.dtos;

import java.io.Serializable;

import com.kalangoti.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {

	// Boa medida para garantir que seja convertido para bytes e possa ser trafegado
	// em rede e ser salvo em arquivo.
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;

	public SellerDTO() {
		super();
	}

	public SellerDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
