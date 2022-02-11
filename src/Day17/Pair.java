package Day17;

public class Pair <k,v> {
    private k key;
    private v value;

    public Pair(k key, v value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }
}
