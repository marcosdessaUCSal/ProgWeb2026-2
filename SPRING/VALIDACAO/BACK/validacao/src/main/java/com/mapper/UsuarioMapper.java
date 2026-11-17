package com.mapper;

import org.springframework.stereotype.Service;

import com.dto.UsuarioDTO;
import com.model.Mail;
import com.model.Usuario;

@Service
public class UsuarioMapper {

	public Usuario dtoToEntity(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		usuario.setId(dto.id);
		usuario.setEmail(new Mail(dto.email));
		return usuario;
	}

	public UsuarioDTO entityToDTO(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.id = usuario.getId();
		dto.email = usuario.getEmail().toString();
		return dto;
	}

}
