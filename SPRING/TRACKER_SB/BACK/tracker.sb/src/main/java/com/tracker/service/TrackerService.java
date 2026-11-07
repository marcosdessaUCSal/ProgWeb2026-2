package com.tracker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.dto.RegistroDto;
import com.tracker.mapper.RegistroMapper;
import com.tracker.model.Registro;
import com.tracker.repository.RegistroRepository;

@Service
public class TrackerService {
	
	@Autowired
	private RegistroMapper mapper;

	@Autowired
	private RegistroRepository registroRepository;

	public List<RegistroDto> getRegistrosDtoPorRastreio(String cod) {
		List<Registro> registros = registroRepository.findByRastreioCodigo(cod);
		return registros.stream()
				.map(
					registro -> mapper.toDto(registro)
				)
				.collect(Collectors.toList());
	}
}
