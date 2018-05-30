package collections;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class ToUnmodifiable {

  @Test
  void shouldCollectStreamToUnmodifiableList(){
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    List<Integer> unmodifiableList = list.stream().filter(v -> v % 2 == 0).collect(Collectors.toUnmodifiableList());

    assertThrows(UnsupportedOperationException.class,()->unmodifiableList.add(1));
  }

}
