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


@RunWith(PowerMockRunner.class)
@PrepareForTest(MusicaDAO.class)
public class MusicaDAOTest {
	
	private MusicaDAO musicaDAO;
	private ArrayList<Musica> array;
	private Musica musica;
	private String string;
	
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
	}
	
	@Test
	public void deletarMusicaTest() {
		
		EasyMock.expect(musicaDAO.deletarMusica(string, string)).andReturn(true);
	}
	
	@Test
	public void buscarMusicaSemFiltroTest() {
		
		EasyMock.expect(musicaDAO.buscarMusicaSemFiltro()).andReturn(array);
	}
	
	@Test
	public void buscarMusicaDePlaylistTest() {
		
		EasyMock.expect(musicaDAO.buscarMusicaDePlaylist(string)).andReturn(array);
	}
	
	@Test
	public void buscarMusicaTest() {
		
		EasyMock.expect(musicaDAO.buscarMusica(string, string)).andReturn(true);
	}
	

}
