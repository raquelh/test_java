package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.java.Identifier;

public class IdentifierTest {

    //Teste de limites da classe valid_f
    //A classe valid_s não precisa ser testada pq é equivalente a esses testes
    @Test
    public void testValid_f() {
        Identifier identifier = new Identifier();
        assertEquals(identifier.valid_f('A'), true);
        assertEquals(identifier.valid_f('z'), true);
        assertEquals(identifier.valid_f('0'), true);
        assertEquals(identifier.valid_f('8'), true);

        //Agora os erros
        assertEquals(identifier.valid_f('-'), false);

    }
    
    @Test
    public void testValidIdentifier_LengthOne() {
        Identifier identifier = new Identifier();
        String input = "A";
        boolean result = identifier.validateIdentifier(input);
        assertEquals(result, true); 
    }

    @Test
    public void testValidIdentifier_LengthFive() {
        Identifier identifier = new Identifier();
        String input = "abc12";
        boolean result = identifier.validateIdentifier(input);
        assertEquals(result, true);
    }

    @Test
    public void testInvalidIdentifier_ExceedsLength() {
      Identifier identifier = new Identifier();
      String input = "abcdef";
      boolean result = identifier.validateIdentifier(input);
      assertEquals(result, false);
    }

    @Test
    public void testInvalidIdentifier_InvalidFirstChar() {
        Identifier identifier = new Identifier();
        String input = "!abc";
        boolean result = identifier.validateIdentifier(input);
        assertEquals(result, false);
    }

    @Test
    public void testInvalidIdentifier_InvalidInnerChar() {
        Identifier identifier = new Identifier();
        String input = "ab#c";
        boolean result = identifier.validateIdentifier(input);
        assertEquals(result, false);
    }
}
