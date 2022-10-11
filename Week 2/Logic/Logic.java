public class Logic {
    public static void main(String[] args){
        int tea = 5;
        int candy = 11;
        int rating = 0;

        if (tea >= 5 && candy >= 5){
            rating = 1;
            if (tea >= candy * 2 || candy >= tea * 2){
                rating = 2;
            }
        }
        else{
            rating = 0;
        }
        System.out.println(rating);
    }
}
