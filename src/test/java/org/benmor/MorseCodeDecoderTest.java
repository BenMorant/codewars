package org.benmor;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MorseCodeDecoderTest {
  @Test
  public void testExampleFromDescription() {
    assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    assertThat(MorseCodeDecoder.decode(" ."), is("E"));
  }
}
