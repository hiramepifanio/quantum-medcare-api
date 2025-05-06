package br.com.quantummedcare.api.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserDto {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
