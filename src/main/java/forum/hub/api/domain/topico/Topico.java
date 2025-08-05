package forum.hub.api.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensagem;

    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    private Estado status;

    private String nomeAutor;

    @Enumerated(EnumType.STRING)
    private Curso nomeCurso;

    public Topico(DadosTopico dados) {
        this.mensagem = dados.mensagem();
        this.nomeCurso= dados.nomeCurso();
        this.titulo = dados.titulo();
    }
}
