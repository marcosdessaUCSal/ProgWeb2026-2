package dto;

import model.Registro;

public class RegistroDto {
	
	public String data;
	public String cidade;
	public String descr;
	
	public RegistroDto(String data, String cidade, String descr) {
		super();
		this.data = data;
		this.cidade = cidade;
		this.descr = descr;
	}
}
