package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank(message = "O logradouro não pode estar em branco") String logradouro,
        @NotBlank(message = "O bairro não pode estar em branco") String bairro,
        @NotBlank(message = "O CEP não pode estar em branco") @Pattern(regexp = "\\d{8}", message = "O CEP deve ter 8 dígitos numéricos") String cep,
        @NotBlank(message = "A cidade não pode estar em branco") String cidade,
        @NotBlank(message = "A UF não pode estar em branco") @Pattern(regexp = "^[A-Z]{2}$", message = "A UF deve conter exatamente 2 letras maiúsculas") String uf,
        String complemento,
        String numero) {
}