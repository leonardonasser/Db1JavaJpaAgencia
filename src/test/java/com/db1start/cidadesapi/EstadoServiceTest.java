package com.db1start.cidadesapi;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.EstadoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstadoServiceTest {
	
	@Autowired
	private EstadoService estadoservice;
	

   @After
	public void clean() {
		estadoservice.limpar();
   }
		
	
	@Test
	public void test() {
		Estado estado = estadoservice.criar("Paraná");
		assertNotNull(estado);
		System.out.print(estado.getId());
	}

	@Test
	public void deveBuscarEstado() {
		Estado estado = estadoservice.buscarPorNome("Paraná");
		assertNotNull(estado);
	}

 
	@Test
	public void deveLancarExcecao() {
		try {
			Estado estado = estadoservice.buscarPorNome("São Paulo");	
		}
		catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}
   
	

}