package com.contatos.mapper;

import org.springframework.stereotype.Service;

import com.contatos.dto.ContatoDto;
import com.contatos.model.Contato;

@Service
public class ContatosMapper {

	public Contato dtoToEntity(ContatoDto dto) {
		Contato contato = new Contato(
				dto.id,
				dto.nome,
				dto.email,
				dto.marcado
		);
		return contato;
	}

	public ContatoDto EntityToDto(Contato contato) {
		ContatoDto dto = new ContatoDto(
				contato.getId(),
				contato.getNome(),
				contato.getEmail(),
				contato.isMarcado()
		);
		return dto;
	}

}
