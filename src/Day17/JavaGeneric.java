package Day17;
/*
* Generic of java.
* In Generic, we can use multiple number of data types.*/
public class JavaGeneric {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("Name", "Value");
        Pair <Integer,Integer>pair1 = new Pair<>(1,2);
        Pair <String, Integer> pair2 = new Pair<>("Bijay", 2);
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair);
    }
}
