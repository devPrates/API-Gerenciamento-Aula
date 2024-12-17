package com.gerenciamentoaula.uc.manter_usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRegisterRequest {
    private String nome;
    private String username;
    private String password;
}
