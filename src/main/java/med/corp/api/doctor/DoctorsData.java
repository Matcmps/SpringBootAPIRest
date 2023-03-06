package med.corp.api.doctor;

import med.corp.api.adress.Endereco;

public record DoctorsData(String nome,
                          String email,
                          String crm,
                          Expertise especialidade,
                          Endereco endereco) {
}
