package br.com.williamsouza.endereco.config;

import feign.auth.BasicAuthRequestInterceptor;
import lombok.Data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class CepFeingConfig {

    @org.springframework.beans.factory.annotation.Value("${api.cep.username}")
    private String usuario;

    @org.springframework.beans.factory.annotation.Value("${api.cep.senha}")
    private String senha;

    private BasicAuthRequestInterceptor basicAuthRequestInterceptor;

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(usuario, senha);

    }

}
