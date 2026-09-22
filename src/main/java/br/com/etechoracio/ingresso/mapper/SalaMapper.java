package br.com.etechoracio.ingresso.mapper;

import br.com.etechoracio.ingresso.dto.SalaRequestDTO;
import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sala;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SalaMapper {

    List<SalaResponseDTO> listaEntidadeSalaParaListaSalaResponse(List<Sala> entidades);
    SalaResponseDTO entidadeSalaParaSalaResponse(Sala entidade);
    Sala salaRequestParaEntidade(SalaRequestDTO request);

}
