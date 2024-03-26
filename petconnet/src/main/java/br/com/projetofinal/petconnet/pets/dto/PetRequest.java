package br.com.projetofinal.petconnet.pets.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String type;

    private Integer age;

    private String raca;

}
