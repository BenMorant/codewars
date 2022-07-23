package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveStringSpaceTest {

  @Test
  public void testRemoveStringSpace() {
    assertEquals(
        "8j8mBliB8gimjB8B8jlB", RemoveStringSpace.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    assertEquals(
        "88Bifk8hB8BB8BBBB888chl8BhBfd",
        RemoveStringSpace.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
    assertEquals("8aaaaaddddr", RemoveStringSpace.noSpace("8aaaaa dddd r     "));
    assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpace.noSpace("jfBm  gk lf8hg  88lbe8 "));
    assertEquals("8jaam", RemoveStringSpace.noSpace("8j aam"));
  }
}
