package com.crud.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.repository.CrudRepository.findOne;

import com.crud.api.documents.Cliente;
import com.crud.api.repositories.ClienteRepository;
import com.crud.api.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRespository;

	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRespository.findAll();
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRespository.deleteById(id);
	}

	@Override
	public Cliente listarPorId(String id) {
		// TODO Auto-generated method stub
		return this.clienteRespository.findOne(id);
	}

}
