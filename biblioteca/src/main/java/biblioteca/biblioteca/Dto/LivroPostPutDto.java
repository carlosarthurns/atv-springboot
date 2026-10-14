package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import biblioteca.biblioteca.Model.Autor;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroPostPutDto {
    @JsonProperty("titulo")
    @NotBlank(message = "O titulo do livro não pode ser vazio")
    private String titulo;

    @JsonProperty("isbn")
    @NotBlank(message = "ISBN do livro não pode ser vazio")
    private String isbn;

    @JsonProperty("autor")
    @NotBlank(message = "O autor do livro não pode ser vazio")
    private Autor autor;

    @JsonProperty("ano")
    @NotBlank(message = "O ano do livro não pode ser vazio")
    private String ano;

    @JsonProperty("edicao")
    @NotBlank(message = "A edição do livro não pode ser vazio")
    private String edicao;
}