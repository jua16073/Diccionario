import static org.junit.Assert.*;

import org.junit.Test;

public class TraducirTest {

	@Test
	public void test() {
		Traducir x= new Traducir();
		x.llenar("house,casa");
		String resultado = x.traduccion("house");
		assertEquals("casa ", resultado);
	}

}
