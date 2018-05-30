package collections;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

class CopyOf {

  @Test
  void shouldCopyList() {
    List<Integer> list = List.of(1, 2, 3, 4);
    List<Integer> copy = List.copyOf(list);
    assertThat(list).isEqualTo(copy);
  }

  @Test
  void shouldCopySet() {
    Set<Integer> list = Set.of(1, 2, 3, 4);
    Set<Integer> copy = Set.copyOf(list);
    assertThat(list).isEqualTo(copy);
  }

  @Test
  void shouldCopyMap() {
    Map<String, Integer> map = Map.of("a", 1, "b", 2);
    Map<String, Integer> copyOf = Map.copyOf(map);
    assertThat(map).isEqualTo(copyOf);
  }

  @Test
  void shouldThrowExceptionWhenTryModifyCopyList() {
    List<Integer> list = List.of(1, 2, 3, 4);
    List<Integer> copy = List.copyOf(list);
    assertThrows(UnsupportedOperationException.class, () -> copy.add(6));
  }

  @Test
  void shouldNotModifyCopyWhenInputChanged() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    List<Integer> copy = List.copyOf(list);

    list.add(2);

    assertThat(copy).isNotEqualTo(list);
  }

}
