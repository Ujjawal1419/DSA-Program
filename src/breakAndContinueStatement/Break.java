package breakAndContinueStatement;

public class Break {
    public static void main(String[]args){
        int i=1;
        while(true){
            if(i>=10)
                break;
            System.out.println(i);
//            if(i>=10)
//                break;
            i++;
        }
    }
}
