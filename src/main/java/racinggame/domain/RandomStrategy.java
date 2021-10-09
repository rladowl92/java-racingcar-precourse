package racinggame.domain;

import nextstep.utils.Randoms;

public class RandomStrategy implements MovingStrategy {
    private static final int START_RANGE = 0;
    private static final int END_RANGE = 9;
    private static final int GO_CONDITION = 4;

    @Override
    public boolean isMovable() {
        return getRandomInt() >= GO_CONDITION;
    }

    int getRandomInt() {
        return Randoms.pickNumberInRange(START_RANGE, END_RANGE);
    }
}
