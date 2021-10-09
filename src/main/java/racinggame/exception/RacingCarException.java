package racinggame.exception;

public class RacingCarException extends IllegalArgumentException {
    public RacingCarException() {
        super();
    }

    public RacingCarException(String msg) {
        super("[ERROR] " + msg);
    }

    public RacingCarException(String msg, Throwable cause) {
        super("[ERROR] " + msg, cause);
    }
}
