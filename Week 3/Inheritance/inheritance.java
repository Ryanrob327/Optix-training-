public class inheritance {
    public static void main(String[] args){

    }
}
class Parent{
    String last_name = "McWeeny";
    String eye_color = "Blue";

    public Parent(String last_name, String eye_color){
        this.last_name = last_name;
        this.eye_color = eye_color;
    }
    public String getLastName(){
        return(last_name);
    }
    
}
class Child extends Parent{
    String first_name = "Ryan";

    public Child(String first_name, String eye_color, String last_name){
        super(eye_color, last_name);
        this.first_name = first_name;
    }
    public String getFullName(){
        return first_name + " " + super.getLastName();
    }
    public String getEyeColor(){
        return super.eye_color;
    }
}