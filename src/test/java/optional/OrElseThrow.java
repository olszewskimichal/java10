package optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class OrElseThrow {

  @Test
  void whenListContainsInteger_OrElseThrowReturnsInteger() {
    Integer result = List.of(1, 2, 3, 4)
        .stream()
        .filter(i -> i % 2 == 0)
        .findFirst()
        .orElseThrow();
    assertThat(result).isEqualTo(2);
  }

  @Test
  void shouldThrowExceptionWhenValueIsNotPresent() {
    assertThrows(NoSuchElementException.class, () -> List.of(1, 2, 3, 4)
        .stream()
        .filter(i -> i % 5 == 0)
        .findFirst()
        .orElseThrow());
  }

}
