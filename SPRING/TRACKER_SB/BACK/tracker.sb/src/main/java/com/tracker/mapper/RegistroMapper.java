package com.tracker.mapper;

import org.springframework.stereotype.Service;

import com.tracker.dto.RegistroDto;
import com.tracker.model.Registro;

@Service
public class RegistroMapper {
	
	public RegistroDto toDto(Registro reg) {
		RegistroDto dto = new RegistroDto(
				reg.getData(),
				reg.getCidade(),
				reg.getDescr()
		);
		return dto;
	}

}
