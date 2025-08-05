package forum.hub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosTopico(

			@NotBlank
	        String mensagem,

			@NotNull
            Curso nomeCurso,

			@NotBlank
            String titulo

) {
}
