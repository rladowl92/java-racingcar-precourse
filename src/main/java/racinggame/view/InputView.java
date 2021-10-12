package racinggame.view;

import nextstep.utils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String NAME_SPLIT_KEYWORD = ",";

    public List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String input = Console.readLine();
        return Arrays.asList(input.split(NAME_SPLIT_KEYWORD));
    }

    public int inputNumberOfAttempts() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return Integer.parseInt(Console.readLine());
    }
}
