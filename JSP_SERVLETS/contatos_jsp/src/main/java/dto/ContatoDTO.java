package dto;

public class ContatoDTO {

	public Long id;
	public String nome;
	public String email;
	public boolean marcado;

	public ContatoDTO() {
	}

	public ContatoDTO(Long id, String nome, String email, boolean marcado) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.marcado = marcado;
	}

}
