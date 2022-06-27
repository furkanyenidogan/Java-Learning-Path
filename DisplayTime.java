public class DisplayTime {
    public static void main(String[] args) {
     displayDuration(3825);
    }
    
    public static void displayDuration( int n ) {
		int hour = 3600, minute = 60;
		
		int h = 0 , m = 0;
		
		while ( n > 60 ) {
			if (n >= hour) {
				h = n / hour;
				n = n % hour;
			} else if ( n >= 60) {
				m = n / minute;
				n = n % minute;
			}
		
		}
		System.out.printf("saat = %d dakika = %d saniye = %d " , h,m,n);
	
		
	}
}
