package forumhub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacao(Long id,
                               @NotBlank
                                     String titulo,
                               @NotBlank
                                     String mensagem,
                               String autor,
                               String curso) {
}
