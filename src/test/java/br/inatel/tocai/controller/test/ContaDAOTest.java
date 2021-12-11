package br.inatel.tocai.controller.test;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.inatel.tocai.controller.ContaDAO;
import br.inatel.tocai.model.Conta;
import br.inatel.tocai.model.Endereco;
import br.inatel.tocai.model.Usuario;
import junit.framework.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ContaDAO.class)
public class ContaDAOTest {
	
	private Usuario usuario;
	private Conta conta;
	private ContaDAO contaDAO;
	private String string;
	private ArrayList<Endereco> array;
	private boolean verifica;
	
	@Before
	public void init() {
		contaDAO = PowerMock.createMock(ContaDAO.class);
		usuario = PowerMock.createMock(Usuario.class);
		conta = PowerMock.createMock(Conta.class);
		string = PowerMock.createMock(String.class);
		array = PowerMock.createMock(ArrayList.class);
	}
	
	@Test
	public void inserirContaTest() {
		
	    EasyMock.expect(contaDAO.inserirConta(usuario, conta)).andReturn(true);
	    
	    EasyMock.replay(contaDAO);
	    verifica = contaDAO.inserirConta(usuario, conta);
	    EasyMock.verify(contaDAO);
	    
	    Assert.assertEquals(true, verifica);
	    }
	
	@Test
	public void deletarContaTest() {
	
		EasyMock.expect(contaDAO.deletarConta(string)).andReturn(true);
		
		EasyMock.replay(contaDAO);
	    verifica = contaDAO.deletarConta(string);
	    EasyMock.verify(contaDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void atualizarContaTest() {
	
		EasyMock.expect(contaDAO.atualizaConta(string, string, string)).andReturn(true);
		
		EasyMock.replay(contaDAO);
	    verifica = contaDAO.atualizaConta(string, string, string);
	    EasyMock.verify(contaDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void buscarLoginTest() {
		
		EasyMock.expect(contaDAO.buscarLogin(string, string)).andReturn(true);
		
		EasyMock.replay(contaDAO);
	    verifica = contaDAO.buscarLogin(string, string);
	    EasyMock.verify(contaDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void buscarCPFTest() {
		
		EasyMock.expect(contaDAO.buscarCPF(string, string)).andReturn(string);
		
		EasyMock.replay(contaDAO);
	    String cpf = contaDAO.buscarCPF(string, string);
	    EasyMock.verify(contaDAO);
	    
	    Assert.assertEquals(string, cpf);
	}
	
	@Test
	public void buscarEnderecoTest() {
		
		EasyMock.expect(contaDAO.buscarEndereco(string)).andReturn(array);
		
		EasyMock.replay(contaDAO);
	    ArrayList<Endereco> enderecos = contaDAO.buscarEndereco(string);
	    EasyMock.verify(contaDAO);
	    
	    Assert.assertEquals(array, enderecos);
	}
	
	
	

}
