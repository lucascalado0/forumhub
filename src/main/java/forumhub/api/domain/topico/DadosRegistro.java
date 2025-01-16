package forumhub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosRegistro(@NotBlank
                            String titulo,
                            @NotBlank
                            String mensagem,
                            @NotBlank
                            String autor,
                            @NotBlank
                            String nomeCurso,
                            @NotNull
                            LocalDateTime dataCriacao,
                            Status estadoTopico) {
    public DadosRegistro {

        if (dataCriacao == null) {
            dataCriacao = LocalDateTime.now();
        }

        if (estadoTopico == null) {
            estadoTopico = estadoTopico.ABERTO;
        }
    }
}
