package com.db1start.cidadesapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.repository.AgenciaRepository;
import com.db1start.cidadesapi.repository.ClienteRepository;
import com.db1start.cidadesapi.repository.ContaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContaRepositoryTest {

	
	
	
	@Autowired
	private ContaRepository contaRepository;
	
	@Autowired
	private AgenciaRepository agenciaRepository;
	
	@Autowired
	private ClienteRepository clienteRepository; 
	
	@After
	public void limparAgencia() {
		contaRepository.deleteAll();
		clienteRepository.deleteAll();
		agenciaRepository.deleteAll();
	}
	
	
	@Test
	void testeConta() {
	Cliente cliente = clienteRepository.save(new Cliente(""));
		
		
	}

}
