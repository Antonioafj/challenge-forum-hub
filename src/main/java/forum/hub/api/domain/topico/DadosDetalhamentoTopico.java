package forum.hub.api.domain.topico;

import java.time.LocalDateTime;
import java.util.List;

public record DadosDetalhamentoTopico(

        Long id,

        String titulo,

        String mensagem,

        LocalDateTime dataCriacao,

        String nomeAutor,

        String status,

        List<String> respostas
) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getNomeAutor() != null ? topico.getNomeAutor().toString() : "Aluno",
                topico.getStatus().toString(),
                topico.getRepostas());
    }
}
