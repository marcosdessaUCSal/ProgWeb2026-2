package com.dto;

public class UsuarioDTO {
	
	public Long id;
	public String email;
	
	public UsuarioDTO() {}

	public UsuarioDTO(Long id, String email) {
		this.id = id;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", email=" + email + "]";
	}
	
}
