package br.inatel.tocai.controller.test;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.inatel.tocai.controller.PlaylistDAO;
import br.inatel.tocai.model.Playlist;
import junit.framework.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PlaylistDAO.class)
public class PlaylistDAOTest {

	private Playlist playlist;
	private PlaylistDAO playlistDAO;
	private String string;
	private ArrayList<Playlist> array;
	private boolean verifica;
	
	@Before
	public void init() {
		playlistDAO = PowerMock.createMock(PlaylistDAO.class);
		playlist = PowerMock.createMock(Playlist.class);
		string = PowerMock.createMock(String.class);
		array = PowerMock.createMock(ArrayList.class);
	}
	
	@Test
	public void inserirPlaylistTest() {
		
		EasyMock.expect(playlistDAO.inserirPlaylist(playlist, string)).andReturn(true);
		
		EasyMock.replay(playlistDAO);
	    verifica = playlistDAO.inserirPlaylist(playlist, string);
	    EasyMock.verify(playlistDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void atualizarPlaylistTest() {
		
		EasyMock.expect(playlistDAO.atualizaPlaylist(string, string)).andReturn(true);
		
		EasyMock.replay(playlistDAO);
	    verifica = playlistDAO.atualizaPlaylist(string, string);
	    EasyMock.verify(playlistDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void deletarPlaylistTest() {
		
		EasyMock.expect(playlistDAO.deletarPlaylist(string, string)).andReturn(true);
		
		EasyMock.replay(playlistDAO);
	    verifica = playlistDAO.deletarPlaylist(string, string);
	    EasyMock.verify(playlistDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void buscarExistenciaDePlaylistTest() {
		
		EasyMock.expect(playlistDAO.buscarExistenciaDePlaylist(string, string)).andReturn(true);
		
		EasyMock.replay(playlistDAO);
	    verifica = playlistDAO.buscarExistenciaDePlaylist(string, string);
	    EasyMock.verify(playlistDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
	
	@Test
	public void buscarPlaylistCadastradasTest() {
	
		EasyMock.expect(playlistDAO.buscarPlaylistCadastradas(string)).andReturn(array);
		
		EasyMock.replay(playlistDAO);
	    ArrayList<Playlist> playlists = playlistDAO.buscarPlaylistCadastradas(string);
	    EasyMock.verify(playlistDAO);
	    
	    Assert.assertEquals(array, playlists);
	}
	
	@Test
	public void addMusicaEmPlaylistTest() {
	
		EasyMock.expect(playlistDAO.addMusicaEmPlaylist(string, string, string, string)).andReturn(true);
		
		EasyMock.replay(playlistDAO);
	    verifica = playlistDAO.addMusicaEmPlaylist(string, string, string, string);
	    EasyMock.verify(playlistDAO);
	    
	    Assert.assertEquals(true, verifica);
	}
}
