package br.com.williamsouza.endereco.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.com.williamsouza.endereco.response.EnderecoResponse;

// @Service
@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("{cep}/json")
    EnderecoResponse obterCep(@PathVariable("cep") String cep);

}
