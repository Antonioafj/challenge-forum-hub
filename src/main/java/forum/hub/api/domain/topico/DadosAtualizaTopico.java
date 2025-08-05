package forum.hub.api.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizaTopico(

        @NotNull
        Long id,

        String mensagem,

        String titulo
) {
}
