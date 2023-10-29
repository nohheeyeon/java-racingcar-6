package ui;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        List<String> carNames = splitByComma(input);
        validateCarNames(carNames);
        return carNames;
    }

    public static int inputNumberOfTries() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        int numberOfTries = Integer.parseInt(input);
        validateInputNumbers(numberOfTries);
        return Integer.parseInt(input);
    }

    private static List<String> splitByComma(String input) {
        return Arrays.asList(input.split(","));
    }

    private static void validateCarNames(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
            }
            if (carName.contains(" ")) {
                throw new IllegalArgumentException("자동차 이름에 공백은 불가능합니다.");
            }
        }
    }

    private static void validateInputNumbers(int numberOfTries) {
        if (numberOfTries < 0) {
            throw new IllegalArgumentException("음수 라운드 입력은 불가능합니다.");
        }
    }
}
