package br.com.projetofinal.petconnet.pets.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetResponse {

    private Long id;
    private String name;
    private String type;
    private Integer age;
    private String breed;
    private String color;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
