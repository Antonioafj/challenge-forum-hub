package forum.hub.api.domain.topico;

import java.time.LocalDateTime;

public record DadosListaTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao) {

    public DadosListaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao());
    }
}
