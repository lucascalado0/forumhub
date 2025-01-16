package forumhub.api.domain.topico;

import java.time.LocalDateTime;

public record DadosListagem(Long id, String titulo, String mensagem, String autor, String curso,
                            LocalDateTime dataCriacao, Status estadoTopico) {
    public DadosListagem(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getCurso(), topico.getDataCriacao(), topico.getEstadoTopico());
    }
}
