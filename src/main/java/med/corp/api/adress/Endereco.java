package med.corp.api.adress;

import med.corp.api.doctor.Expertise;

public record Endereco(String logradouro,
                       String bairro,
                       String cep,
                       String cidade,
                       String uf,
                       String numero,
                       String complemento) {
}
