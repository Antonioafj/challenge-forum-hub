package forum.hub.api.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record DadosRespostaTopico(

        @NotNull
        Long id,

        String respostas
) {
}
