package com.todolist.mapper;

import org.springframework.stereotype.Service;

import com.todolist.dto.TarefaDto;
import com.todolist.model.Tarefa;

@Service
public class TarefaMapper {
	
	public TarefaDto entityToDto(Tarefa tarefa) {
		TarefaDto dto = new TarefaDto();
		dto.id = tarefa.getId();
		dto.txt = tarefa.getTxt();
		dto.marcado = tarefa.isMarcado();
		return dto;
	}
	
	public Tarefa dtoToEntity(TarefaDto dto) {
		Tarefa tarefa = new Tarefa();
		tarefa.setId(dto.id);
		tarefa.setTxt(dto.txt);
		tarefa.setMarcado(dto.marcado);
		return tarefa;
	}

}
