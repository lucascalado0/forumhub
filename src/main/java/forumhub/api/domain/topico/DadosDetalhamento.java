package forumhub.api.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhamento(Long id, String titulo, String mensagem, String curso, Status estadoTopico,
                                String autor, LocalDateTime dataCriacao) {
    public DadosDetalhamento(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getCurso(), topico.getEstadoTopico(), topico.getAutor(), topico.getDataCriacao());
    }
}