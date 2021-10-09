package racinggame.domain;

import racinggame.exception.RacingCarException;

import java.util.Objects;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;

    private String name;

    CarName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new RacingCarException("자동차 이름은 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
