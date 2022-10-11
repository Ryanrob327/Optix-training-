public class while_loop {
    public static void main(String[] args){
        int num = 64;
        boolean run = true;
        while(run){
            System.out.println(num);
            num /= 2;
            if (num <= 1){
                run = false; 
                System.out.println("done"); 
            }
        }   
    }
}
