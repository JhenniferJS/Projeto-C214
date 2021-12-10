package br.inatel.tocai.controller.test;


import java.sql.Connection;

import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.inatel.tocai.controller.AccessDataBase;

@RunWith(PowerMockRunner.class)
@PrepareForTest(AccessDataBase.class)
public class AccessDataBaseTest {

	private Connection connection;

	@Test
	public void connectToDbTest() {
		connection = PowerMock.createMock(Connection.class);
	    PowerMock.mockStatic(AccessDataBase.class);
	    EasyMock.expect(AccessDataBase.connectToDb()).andReturn(connection);
	}
}

