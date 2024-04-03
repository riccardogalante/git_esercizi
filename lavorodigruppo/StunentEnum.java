package lavorodigruppo;

public enum StunentEnum {
    ROBERTO(3);

    private final int eta;

    StunentEnum(int eta) {
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return "StunentEnum{" +
                "eta=" + eta +
                '}';
    }
}
