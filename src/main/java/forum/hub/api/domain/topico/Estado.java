package forum.hub.api.domain.topico;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Estado {

    RESPONDIDO("respondido"),

    NAO_RESPONDIDO("não respondido");

    private String estado;

    Estado(String curso) {
        this.estado = curso;
    }

    @JsonCreator
    public static Estado fromString(String text) {
        for (Estado estate : Estado.values()) {
            if (estate.estado.equalsIgnoreCase(text)) {
                return estate;
            }
        }
        throw new IllegalArgumentException("Nenhum curso encontrado para a string fornecida: " + text);
    }
}
