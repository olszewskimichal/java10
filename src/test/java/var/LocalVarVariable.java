package var;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class LocalVarVariable {

  @Test
  void stringVar() {
    var message = "Hello Java 10";
    assertThat(message).isInstanceOf(String.class);
  }

  @Test
  void whenVarInitWithAnonymous_thenGetAnonymousType() {
    var obj = new Object() {
    };
    assertNotEquals(obj.getClass(), Object.class);
  }

  @Test
  void canReassignVarVariable() {
    var name = "Luke";
    name = "Eva";
    assertThat(name).isEqualTo("Eva");

  }


}
