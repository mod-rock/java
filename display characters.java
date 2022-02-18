import java.util.*;

class AsciValue{

        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digits:");
        
        for(int i=0; i<4; i++){
            int input = in.nextInt();
            System.out.println(input + " - " + (char) input);
        }
    }
}