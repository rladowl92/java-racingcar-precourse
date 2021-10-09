package racinggame.domain;

import java.util.Objects;

public class Score {
    private int value;

    public Score() {
        this(0);
    }

    public Score(int value) {
        this.value = value;
    }

    public void addScore() {
        value++;
    }

    public boolean isSameScore(Score score) {
        return value == score.getValue();
    }

    public boolean lessThan(Score maxScore) {
        return value < maxScore.getValue();
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return value == score.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
