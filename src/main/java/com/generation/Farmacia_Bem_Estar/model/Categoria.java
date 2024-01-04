package com.generation.Farmacia_Bem_Estar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O produto não pode ficar sem uma categoria")
	@Column(length = 100)
	@Size(min =5, max= 100, message = "O atributo categoria pode ter no minimo 5 caracteres e no maximo 100 caracteres")
	private String categoria;
	
	@NotBlank(message = "O produto não pode ficar sem uma descrição")
	@Column(length = 250)
	@Size(min = 10, max = 250, message = "O atributo descriçãpode ter no minimo 10 caracteres e no maximo 250 caracteres ")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
