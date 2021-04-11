package com.datastructure;

import static org.junit.Assert.assertTrue;

import com.categories.UnitTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class KeyValueDSTest {

  private final KeyValueDS keyValueDS = new KeyValueDS();

  @Test
  public void testPutMethod() {
    keyValueDS.put(1, "a");
    keyValueDS.put(2, "c");
    keyValueDS.put(2, "b");

    assertTrue(keyValueDS.size() == 2);
  }

  @Test
  public void testGetMethod() {
    keyValueDS.put(1, "abc");
    keyValueDS.put(2, "bcd");
    assertTrue(keyValueDS.get(1) == "abc");
    assertTrue(keyValueDS.get(2) == "bcd");
    assertTrue(keyValueDS.get(0) == null);
  }
}
