package mapper;

import dto.ContatoDTO;
import model.Contato;

public class Mapper {

	public static Contato getContatoFromDto(ContatoDTO dto) {
		Contato cto = new Contato(dto.id, dto.nome, dto.email, dto.marcado);

		return cto;
	}

	public static ContatoDTO getDtoFromContato(Contato contato) {
		ContatoDTO dto = new ContatoDTO(
				contato.getId(),
				contato.getNome(),
				contato.getEmail(),
				contato.isMarcado()
		);
		return dto;
	}

}
