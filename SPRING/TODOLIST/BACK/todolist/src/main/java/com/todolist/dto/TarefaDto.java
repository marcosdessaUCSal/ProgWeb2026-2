package com.todolist.dto;

public class TarefaDto {

	public Long id;
	public String txt;
	public boolean marcado;

	public TarefaDto() {
	}

	public TarefaDto(Long id, String txt, boolean marcado) {
		this.id = id;
		this.txt = txt;
		this.marcado = marcado;
	}

}
