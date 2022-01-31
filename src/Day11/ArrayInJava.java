package Day11;

public class ArrayInJava {
    public static void main(String[] args) {
        Students[] arr;
        arr = new Students[6];
        arr[0] = new Students("John",10);
        arr[1] = new Students("Alice",11);
        arr[2] = new Students("Bob",12);
        arr[3] = new Students("Charlotte",13);
        arr[4] = new Students("Dick",8);
        arr[5] = new Students("Eugene",9);
        for(int i=0; i< arr.length;i++){
            System.out.println("Position at :" + i + "Name:" + arr[i].name +"Age:" + arr[i].age );
        }
    }
}

class Students{
    public String name;
    public int age;
    Students(String name, int age){
        this.age = age;
        this.name = name;
    }
}
