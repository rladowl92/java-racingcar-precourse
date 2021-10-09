package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreTest {
    @Test
    void create() {
        Score score = new Score();
        assertThat(score).isEqualTo(new Score());
    }

    @DisplayName("addScore를 하면 스코어가 1 증가해야한다.")
    @Test
    void add() {
        Score score = new Score();
        score.addScore();
        assertThat(score.getValue()).isEqualTo(1);
    }

    @DisplayName("전달받은 숫자와 스코어가 같다면 true를 반환한다.")
    @Test
    void same() {
        Score score = new Score(1);
        Score score2 = new Score(1);
        assertThat(score.isSameScore(score2)).isTrue();
    }

    @DisplayName("전달받은 숫자보다 작다면 true를 반환한다.")
    @Test
    void less() {
        Score score = new Score(1);
        Score score2 = new Score(2);
        assertThat(score.lessThan(score2)).isTrue();
    }
}