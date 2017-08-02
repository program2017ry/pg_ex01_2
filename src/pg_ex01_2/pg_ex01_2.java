package pg_ex01_2;

public class pg_ex01_2 {
	public static void main(String[] args) {
	}
	public static void change(int x) {
		if ((x >= 1) && (x <= 20)) {
			if (x >= 10){
				System.out.print("X");
				x = x - 10;
			}
			else{
			}

			if ((x + 1) % 5 == 0){
				System.out.print("I");
				x = x + 1;
			}
			else{
			}

			if (x == 10){
				System.out.print("X");
				x = x - 10;
			}
			else{
			}

			if (x >= 5){
				System.out.print("V");
				x = x - 5;
			}
			else{
			}

			for (int i=x ;i > 0;i--) {
				System.out.print("I");
			}

		}
		else {
			System.out.println("変換できません");
		}
	}
}
