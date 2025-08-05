package forum.hub.api.domain.topico;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Curso {

    JAVA("java"),
    JAVA_SCRIPT("javascript"),
    PYTHON("python"),
    GO("go"),
    KOTLIN("kotlin"),
    TYPE_SCRIPT("typescript"),
    SWIFT("swift"),
    RUBY("ruby"),
    C("c"),
    C_SHARP("c#"),
    C_PLUS_PLUS("c++"),
    DOT_NET(".net"),
    RUST("rust"),
    SPRING("spring"),
    SQL("sql"),
    FRONT_END("front end"),
    INTELIGENCIA_ARTIFICIAL("inteligencia artificial"),
    R("r"),
    MOBILE("mobile"),
    UX_DESIGN("ux e design"),
    DEVOPS("devops"),
    HTML("html"),
    CSS("css"),
    ANGULAR("angular"),
    REACT("react"),
    PHP("php"),
    AWS("aws"),
    GOOGLE_CLOUD("google cloud"),
    AZURE("azure"),
    POWER_BI(" power bi");


    private String curso;

    Curso(String curso) {
        this.curso = curso;
    }

    @JsonCreator
    public static Curso fromString(String text) {
        for (Curso categoria : Curso.values()) {
            if (categoria.curso.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhum curso encontrado para a string fornecida: " + text);
    }
}
