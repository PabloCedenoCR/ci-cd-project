package net.avantica.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AppTest {

  @Test
  public void testAppHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }
}
