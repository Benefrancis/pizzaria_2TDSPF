package br.com.fiap.pizzaria_2TDSPF.resource;


import br.com.fiap.pizzaria_2TDSPF.entity.Cliente;
import br.com.fiap.pizzaria_2TDSPF.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteRepository repo;

    @GetMapping
    public List<Cliente> findAll() {
        return repo.findAll();
    }

    @Transactional
    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return repo.save( cliente );
    }


}
