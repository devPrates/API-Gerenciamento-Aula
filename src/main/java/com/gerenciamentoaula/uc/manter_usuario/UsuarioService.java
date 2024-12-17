package com.gerenciamentoaula.uc.manter_usuario;

import com.gerenciamentoaula.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Usuario user = repository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(
                        "Usuário não encontrado"
                ));
        return user;
    }

    public Usuario save(UsuarioRegisterRequest request) {
        Usuario entity = UsuarioMapper.INSTANCE.toEntity(request);
        return repository.save(entity);
    }

}
