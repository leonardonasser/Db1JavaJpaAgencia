package com.db1start.cidadesapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.repository.AgenciaRepository;
import com.db1start.cidadesapi.repository.CidadeRepository;
import com.db1start.cidadesapi.repository.ClienteRepository;
import com.db1start.cidadesapi.repository.EstadoRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CidadeRepositoryTest {

	@Autowired
	private AgenciaRepository agenciaRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@After
	public void limparAgencia() {
		estadoRepository.deleteAll();
		cidadeRepository.deleteAll();
		agenciaRepository.deleteAll();
		
	}
	
	@Test
	public void testCidade() {
		Estado estado = estadoRepository.save(new Estado("São Paulo"));
		Cidade cidade = cidadeRepository.save(new Cidade("Santos",estado));
	    assertNotNull(cidade);
	}

}
