public class Compare3Number {
    public static void main(String[] args) {
        NumberUtil.NumbComp();
    }
}

class NumberUtil
{
	public static void NumbComp()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Please enter the numbers");
		
		boolean tryagain = true;
		
		while (tryagain) {
			int a = Integer.parseInt(kb.nextLine());
			int b = Integer.parseInt(kb.nextLine());
			int c = Integer.parseInt(kb.nextLine());
			
		if ((a<b)&&(a<c)&&(b<c))
			System.out.printf("%d<%d<%d",a,b,c);
			else if ((a<b)&&(a<c)&&(c<b))
				System.out.printf("%d<%d<%d",a,c,b);
			else if ((a==b)&&(b<c))
				System.out.printf("%d=%d<%d",a,b,c);
			else if ((a==b)&&(c<b))
				System.out.printf("%d<%d=%d",c,a,b);
			else if ((a<b)&&(c==b))
				System.out.printf("%d<%d=%d",a,b,c);
			else if ((a==c)&&(c<b))
				System.out.printf("%d=%d<%d",a,c,b);
			else if ((a==c)&&(b<c))
				System.out.printf("%d<%d=%d",b,c,a);
		
		if ((b<a)&&(b<c)&&(a<c))
			System.out.printf("%d<%d<%d",b,a,c);
			else if ((b<a)&&(b<c)&&(c<a))
				System.out.printf("%d<%d<%d",b,c,a);
			else if ((b==c)&&(b<a))
				System.out.printf("%d=%d<%d",b,c,a);
		
		if ((c<a)&&(c<b)&&(a<b))
			System.out.printf("%d<%d<%d",c,a,b);
		else if ((c<a)&&(c<b)&&(b<a))
			System.out.printf("%d<%d<%d",c,b,a);
		
		if ((a==b)&&(b==c))
			System.out.print("a=b=c");
	
		
		System.out.println("\ntry again? please type true/false");
		
		tryagain = Boolean.parseBoolean(kb.nextLine());
		
		}
    }
}