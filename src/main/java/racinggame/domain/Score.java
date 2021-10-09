package racinggame.domain;

import java.util.Objects;

public class Score {
    private int value;

    public Score(){
        value = 0;
    }

    public void addScore(){
        value++;
    }

    public boolean isSameScore(int value){
        return this.value == value;
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
