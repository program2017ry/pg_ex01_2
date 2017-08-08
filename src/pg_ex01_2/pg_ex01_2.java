package pg_ex01_2;

public class pg_ex01_2 {

	public String change(int x) {
		if ((x >= 1) && (x <= 20)) {
			String roma = "";
			if (x >= 10){
				x = x - 10;
				roma= roma + "X";
			}

			if ((x + 1) % 5 == 0){
				x = x + 1;
				roma= roma + "I";
			}

			if (x == 10){
				x = x - 10;
				roma= roma + "X";
			}

			if (x >= 5){
				x = x - 5;
				roma= roma + "V";
			}

			for (int i=x ;i > 0;i--) {
				roma= roma + "I";
			}
			return roma;

		}
		return "変換できません";
	}
}
