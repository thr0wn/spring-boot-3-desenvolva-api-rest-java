package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
                @NotBlank(message = "O nome não pode estar em branco") String nome,

                @NotBlank(message = "O e-mail não pode estar em branco") @Email(message = "O e-mail deve ser válido") String email,

                @NotBlank(message = "O telefone não pode estar em branco") @Pattern(regexp = "\\d{10,11}", message = "Formato de telefone inválido. Use apenas números (10 ou 11 dígitos).") String telefone,

                @NotBlank(message = "O CRM não pode estar em branco") String crm,
                @NotNull Especialidade especialidade,

                @NotNull @Valid DadosEndereco endereco) {
}