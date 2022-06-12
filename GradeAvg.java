/*Bu programda aşağıda verilen derslerin notları ortalamasının 60 üzeri olup olmadığı kontrolü yapılacaktır.  
  Aşağıdaki sitede verilen basit bir alıştırmadır.
  https://app.patika.dev/courses/java101/pratik-not-ortalamasi
 */

public class GradeAvg {
    public static void main(String[] args) {
        GradeAvg.PassFunc();

        
    }

    public static double CalcAvg(int math, int history, int music,int turkish)
    {
        return (math + history + music + turkish) / 4;
    }
    
    public static void PassFunc()
    {
        boolean pass, failed;

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Please enter your grades");
        int math =Integer.parseInt(kb.nextLine());
        int history =Integer.parseInt(kb.nextLine());
        int music =Integer.parseInt(kb.nextLine());
        int turkish =Integer.parseInt(kb.nextLine());
        
        System.out.println("Your grade average " + GradeAvg.CalcAvg(math, history, music, turkish));
        pass = GradeAvg.CalcAvg(math, history, music, turkish) >= 60.0;
        String result = pass?"Pass":"False";
        
        System.out.println(result);


    }
}
