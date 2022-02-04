package Day13;

/*
* the purpose of inner class is to create a group classes that belongs together
* which makes code more readable and maintainable*/
public class OuterClass {
    public int num = 100;
    class InnerClass{
        public  int num = 200;
        void show(){
            System.out.println("My value of inner CLass: " + OuterClass.this.num);
        }
    }

    public static void main(String[] args) {

//        InnerClass myInner = new OuterClass().new InnerClass();
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();
    }
}
