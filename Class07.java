class CTest {
	int n;
    void test(int n) {
    	if(n == 0) {
    		System.out.println("此數為0");
    	}
    	else if(n % 2 == 1) {
    		System.out.println("此數為奇數");
    	}
    	else {
    		System.out.println("此數為偶數");
    	}
    }
}

public class Main {
	public static void main(String args[]) {
		CTest number;
        number = new CTest();
        System.out.println("test(3)");
        number.test(3);
        System.out.println("test(8)");
        number.test(8);
        System.out.println("test(0)");
        number.test(0);
    }
}
