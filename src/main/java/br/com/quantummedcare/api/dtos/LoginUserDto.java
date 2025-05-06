package br.com.quantummedcare.api.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserDto {
    private String email;
    private String password;
}
