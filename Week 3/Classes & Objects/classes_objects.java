public class classes_objects {
    public static void main(String[] args){
        Me ryan = new Me("Ryan", 16);

        System.out.println("Name: " + ryan.get_name() + "    age: " + ryan.get_age());
    }
}

class Me {
    String name;
    int age;

    public Me(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String get_name(){
        return name;
    }
    public int get_age(){
        return age;
    }
}