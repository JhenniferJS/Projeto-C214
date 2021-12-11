package br.inatel.tocai.controller.test;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.inatel.tocai.controller.MusicaDAO;
import br.inatel.tocai.model.Musica;
import junit.framework.Assert;


@RunWith(PowerMockRunner.class)
@PrepareForTest(MusicaDAO.class)
public class MusicaDAOTest {
	
	private MusicaDAO musicaDAO;
	private ArrayList<Musica> array;
	private Musica musica;
	private String string;
	private boolean verifica;
	
	@Before
	public void init() {
		
		musicaDAO = PowerMock.createMock(MusicaDAO.class);
		musica = PowerMock.createMock(Musica.class);
		string = PowerMock.createMock(String.class);
		array = PowerMock.createMock(ArrayList.class);
	}
	
	@Test
	public void inserirMusicaTest() {
	
		EasyMock.expect(musicaDAO.inserirMusica(musica)).andReturn(true);
		
		EasyMock.replay(musicaDAO);
	    verifica = musicaDAO.inserirMusica(musica);
	    EasyMock.verify(musicaDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void deletarMusicaTest() {
		
		EasyMock.expect(musicaDAO.deletarMusica(string, string)).andReturn(true);
		
		EasyMock.replay(musicaDAO);
	    verifica = musicaDAO.deletarMusica(string, string);
	    EasyMock.verify(musicaDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void buscarMusicaSemFiltroTest() {
		
		EasyMock.expect(musicaDAO.buscarMusicaSemFiltro()).andReturn(array);
		
		EasyMock.replay(musicaDAO);
	    ArrayList musicas = musicaDAO.buscarMusicaSemFiltro();
	    EasyMock.verify(musicaDAO);
	    
	    Assert.assertEquals(array, musicas);
	}
	
	@Test
	public void buscarMusicaDePlaylistTest() {
		
		EasyMock.expect(musicaDAO.buscarMusicaDePlaylist(string)).andReturn(array);
		
		EasyMock.replay(musicaDAO);
	    ArrayList musicas = musicaDAO.buscarMusicaDePlaylist(string);
	    EasyMock.verify(musicaDAO);
	    
	    Assert.assertEquals(array, musicas);
	}
	
	@Test
	public void buscarMusicaTest() {
		
		EasyMock.expect(musicaDAO.buscarMusica(string, string)).andReturn(true);
		
		EasyMock.replay(musicaDAO);
	    verifica = musicaDAO.buscarMusica(string, string);
	    EasyMock.verify(musicaDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	

}
