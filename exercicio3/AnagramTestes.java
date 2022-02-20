package exercicio3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnagramTestes {
	
	@Test
	@DisplayName("O resultado deve ser zero")
	void temQueRetornarZero() {
		Strings c = new Strings();
		assertEquals(0, c.compararSubstring(c.geradorDeSubstring("abc")));
	}
	
	@Test
	@DisplayName("O resultado deve ser dois")
	void temQueRetornarDois() {
		Strings c = new Strings();
		assertEquals(2, c.compararSubstring(c.geradorDeSubstring("ovo")));
	}
	
	@Test
	@DisplayName("O resultado deve ser três")
	void temQueRetornarTres() {
		Strings c = new Strings();
		assertEquals(3, c.compararSubstring(c.geradorDeSubstring("ifailuhkqq")));
	}

}
