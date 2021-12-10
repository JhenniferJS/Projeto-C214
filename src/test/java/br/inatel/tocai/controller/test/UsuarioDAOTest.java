package br.inatel.tocai.controller.test;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.inatel.tocai.controller.UsuarioDAO;
import br.inatel.tocai.model.CartaoCredito;
import br.inatel.tocai.model.Endereco;
import br.inatel.tocai.model.Usuario;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UsuarioDAO.class)
public class UsuarioDAOTest {
	
	private UsuarioDAO usuarioDAO;
	private Usuario usuario;
	private Endereco endereco;
	private CartaoCredito cartaoCredito;
	private String string;
	private ArrayList<Usuario> array;
	
	@Before
	public void init() {
		usuarioDAO = PowerMock.createMock(UsuarioDAO.class);
		usuario = PowerMock.createMock(Usuario.class);
		endereco = PowerMock.createMock(Endereco.class);
		cartaoCredito = PowerMock.createMock(CartaoCredito.class);
		string = PowerMock.createMock(String.class);
		array = PowerMock.createMock(ArrayList.class);
	}
	
	@Test
	public void inserirUsuarioTest() {
	
		EasyMock.expect(usuarioDAO.inserirUsuario(usuario, endereco, cartaoCredito)).andReturn(true);
	}
	
	@Test
	public void deletarrUsuarioTest() {
		
		EasyMock.expect(usuarioDAO.deletarUsuario(string)).andReturn(true);
	}
	
	@Test
	public void atualizaNomeUsuarioTest() {
		
		EasyMock.expect(usuarioDAO.atualizaNomeUsuario(string, string)).andReturn(true);
	}
	
	@Test
	public void atualizaSexoUsuarioTest() {
		
		EasyMock.expect(usuarioDAO.atualizaSexoUsuario(string, string)).andReturn(true);
	}
	
	@Test
	public void atualizaEnderecoUsuarioTest() {
		
		EasyMock.expect(usuarioDAO.atualizarEnderecoUsuario(string, endereco)).andReturn(true);
	}
	
	@Test
	public void buscarUsuarioTest() {
		
		EasyMock.expect(usuarioDAO.buscarUsuario(string)).andReturn(array);
	}

}
