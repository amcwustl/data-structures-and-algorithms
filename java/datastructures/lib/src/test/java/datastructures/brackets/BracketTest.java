package datastructures.brackets;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BracketTest {
  @Test
  public void bracketTest()
  {
    Brackets sut = new Brackets();
    String test = "()[[Extra Characters]]";

    boolean expected = true;
    boolean actual = sut.validateBrackets(test);

    assertEquals(expected, actual);
  }

  @Test
  public void bracketTestTwo()
  {
    Brackets sut = new Brackets();
    String test = "{(})";

    boolean expected = false;
    boolean actual = sut.validateBrackets(test);

    assertEquals(expected, actual);
  }



}
