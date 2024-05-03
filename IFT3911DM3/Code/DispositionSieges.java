public enum DispositionSieges {
    S('S'),
    C('C'),
    M('M'),
    L('L');

    private final char seatChar;

    DispositionSieges(char seatChar) {
        this.seatChar = seatChar;
    }

    public char asChar() {
        return this.seatChar;
    }
}