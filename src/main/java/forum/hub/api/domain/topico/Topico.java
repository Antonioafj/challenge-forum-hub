package forum.hub.api.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @ElementCollection
    @CollectionTable(name = "repostas", joinColumns = @JoinColumn(name = "topico_id"))
    @Column(name = "repostas")
    private List<String> repostas;

    public Topico(DadosTopico dados) {
        this.mensagem = dados.mensagem();
        this.nomeCurso= dados.nomeCurso();
        this.titulo = dados.titulo();
        this.dataCriacao = LocalDateTime.now();
        this.status = Estado.NAO_RESPONDIDO;
    }

    public void atualizarInformacoes(@Valid DadosAtualizaTopico dados) {

        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }

    }

    public void atualizarResposta(@Valid DadosRespostaTopico dados) {
            if (this.repostas == null) {
                this.repostas = new ArrayList<>();
            }
            this.repostas.add(dados.respostas());


        if (!this.repostas.isEmpty()) {
            this.status = Estado.RESPONDIDO;
        }
    }
}



























































































































































































