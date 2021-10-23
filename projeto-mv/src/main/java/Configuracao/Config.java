package Configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.projeto.projeto.mv.repository.UsuarioRepository;
import com.projeto.projeto.mv.service.UsuarioService;

@Configuration
public class Config {

@Bean
public UsuarioService usuarioservice(UsuarioRepository usuariorepository) {
	return new UsuarioService(usuariorepository);
}
 
	
}
