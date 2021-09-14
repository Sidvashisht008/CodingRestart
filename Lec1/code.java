package revision;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fibonacci(10);
//		System.out.println(reverseNum(102));
//		System.out.println(naturalSum(10)); 
//		System.out.println(isPrime(21));
//		System.out.println(gcd(98, 56));
	}
	
	public static int reverseNum(int n) {
		int ans = n;
		int cnt = 0;
		while(ans>0) {
			cnt++;
			ans/=10;
		}
		while(n>0) {
			ans = ans+ (n%10)*(int)Math.pow(10,cnt-1);
			cnt--;
			n/=10;
		}
		return ans;
	}
	
	public static int naturalSum(int n) {
		int sum =0;
		for(int i =1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		for(int i =2;i<n/2;i++) {
			if(n%i==0) {
				flag = false;
				return flag;
			}
		}
		return flag;
	}
	
	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		
		for(int i = 0;i<n;i++) {
			System.out.print(a+" ");
			int temp = a;
			a= b;
			b= temp+b;
		}
	}
	
	public static int gcd(int a,int b) {
		int c = Math.min(a, b);
		while(c>0) {
			if(a%c==0&&b%c==0) {
				return c;
			}
			c--;
		}
		return -1;
	}
}
