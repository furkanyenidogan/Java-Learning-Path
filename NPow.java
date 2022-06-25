public class NPow {

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
    

    public static int pow(int a , int b) {
        int result = 1;

        if (b == 0){
            return 1;
        }else{
        
        for ( int i = 0  ; i < b ; i++){
            result *=a;
        }
    }
    return result;   
        
    }
}
