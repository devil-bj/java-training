package Day16.GenericPractice;

public class ParentClass <n,c,a>  {
    private n name;
    private c cityName;
    private a age;

    public ParentClass(n name, c cityName, a age) {
        this.name =  name;
        this.cityName =  cityName;
        this.age =  age;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "name=" + name +
                ", cityName=" + cityName +
                ", age=" + age +
                '}';
    }

    public n getName() {
        return  name;
    }

    public c getCityName() {
        return cityName;
    }

    public a getAge() {
        return age;
    }
}
