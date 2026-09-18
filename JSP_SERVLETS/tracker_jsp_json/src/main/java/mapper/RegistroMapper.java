package mapper;

import dto.RegistroDto;
import model.Registro;

public class RegistroMapper {
	
	public static Registro getModel(RegistroDto dto) {
		Registro reg = new Registro(
				dto.data,
				dto.cidade,
				dto.descr
				);
		return reg;
	}
	
	public static RegistroDto getDto(Registro reg) {
		RegistroDto dto = new RegistroDto(
				reg.getData(),
				reg.getCidade(),
				reg.getDescr()
				);
		return dto;
	}
}
