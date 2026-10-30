package com.contatos.dto;

public class ContatoDto {

	 public Long id;
	 public String nome;
	 public String email;
	 public boolean marcado;
	 
	 public ContatoDto() {}

	 public ContatoDto(Long id, String nome, String email, boolean marcado) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.marcado = marcado;
	 }
	 
	 
	 
}
