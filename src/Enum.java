enum State {
    START(10, "Start"),
    PENDING(20, "Pending"),
    RESTART(30, "Restart"),
    FAIL(40, "Fail"),
    SUCCESS(50, "Success");

    private int stateNumber;
    private String state;

    State(int stateNumber, String state) {
        this.stateNumber = stateNumber;
        this.state = state;
    }

    int getStateNumber() {
        return stateNumber;
    }

    String getState() {
        return state;
    }

    public static State findByState(String state) {
        for (State st : values()) {
            if (st.getState().equals(state)) {
                return st;
            }
        }
        return null;
    }
}
