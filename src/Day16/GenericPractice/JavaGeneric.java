package Day16.GenericPractice;

public class JavaGeneric {


    public static void main(String[] args) {
        Integer[] values = {34, 28, 27, 39, 17, 17, 9, 8, 2};
        String[] values1 = {"Ajaya", "Bijay", "jaya", "Sanjaya", "Samyog", "Samir", "Syon", "Rihan", "Shreyaan"};
        Double[] values3 = {2d, 3d, 4d, 1d, 5d, 6d, 7d, 8d, 9d};
        Float[] values2 = {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f};


        printArray(values);
        printArray(values1);
        printArray(values2);
        printArray(values3);
    }



    private static <T extends String>void printArray(T[] values) {
        for (T val:values
        ) {
            System.out.println(val);
        }
        System.out.println("Only Numbers are printed in this case:");
    }
    private static <T extends Number>void printArray(T[] values) {
        for (T val:values
        ) {
            System.out.println(val);
        }
        System.out.println("Only String Values are printed in this case: ");
    }

}




//    ParentClass<String, String , Integer> p1 = new ParentClass("Bijay", "Irving", 28);
//    ParentClass<Integer, String , Integer> p2 = new ParentClass(123, "Irving", 28);
//    ParentClass<String, String , Integer> p3 = new ParentClass("Bijay", "Irving", 28);
//
//            System.out.println(p1);
//                    System.out.println(p2);
//                    System.out.println(p3);