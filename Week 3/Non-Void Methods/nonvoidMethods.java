public class nonvoidMethods {
    public static void main(String[] args){
        String name = "Ryan";
        int value = 5;
        boolean bool = true;

        System.out.println(friend(name));
        System.out.println(times2(value));
        System.out.println(invert(bool));
    }
    static String friend(String name){
        return(name + " is friends with Albert");
    }
    static int times2(int value){
        return(value * 2);
    }
    static boolean invert(boolean bool){
        bool = !bool;
        return(bool);
    }
}
