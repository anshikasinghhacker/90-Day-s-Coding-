public class Array {

	public static void main(String[] args) {
		
		int a[] = {20,40,70,80,100};
		int key = 80;
		int res = -1;
		
		for(int i = 0; i<a.length;i++) {
			if(a[i]==key) {
				res = i;		
			}
		}
		
		if(res==-1) {
			System.out.println("Element not found");
		}
		
		else {
			System.out.println("Key found at "+ res);
		}

	}

}
