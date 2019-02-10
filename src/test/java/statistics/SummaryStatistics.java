package statistics;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LongSummaryStatistics;
import org.junit.jupiter.api.Test;

class SummaryStatistics {

  @Test
  void createLongSummaryStatistics(){
    LongSummaryStatistics longSummaryStatistics = new LongSummaryStatistics(1, 1, 1, 1);

    assertThat(longSummaryStatistics.getSum()).isEqualTo(1);
  }
}
