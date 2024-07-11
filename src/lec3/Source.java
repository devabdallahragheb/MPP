package lec3;

public enum Source {
    MAX_VAL(50),
    SHORTEST_NAME("Bob");

    int intval;
    String strval;
    Source(int x) {
        intval = x;
    }
    Source(String str) {
        strval = str;
    }
    public int intval() {
        return intval;
    }
    public String strval() {
        return strval;
    }
}
