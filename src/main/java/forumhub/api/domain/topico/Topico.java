package forumhub.api.domain.topico;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String autor;
    private String curso;

    private Boolean ativo;

    @Enumerated(EnumType.STRING)
    private Status estadoTopico;


    public Topico(DadosRegistro dados) {
        this.ativo = true;
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = dados.dataCriacao();
        this.autor = dados.autor();
        this.curso = dados.nomeCurso();
        this.estadoTopico = dados.estadoTopico();
    }

    public void atualizarInformacoes(DadosAtualizacao dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if (dados.curso() != null) {
            this.curso = dados.curso();
        }
        if (dados.autor() != null) {
            this.autor = dados.autor();
        }


    }

    public void excluir() {
        this.ativo = false;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Status getEstadoTopico() {
        return estadoTopico;
    }
}
