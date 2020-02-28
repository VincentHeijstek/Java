
public class A1_434298 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Variables: quizFinal */		
		int Q1 = 10;
		int Q2 = 10;
		int Q3 = 9;
		int Q4 = 6;
		int Q5 = 8;
		double quizFinal;
		
/* quizFinal: function - 4 highest grades */
		if (Q1<Q2 && Q1<Q3 && Q1<Q4 && Q1<Q5) {        /*Q1 lowest grade*/
			quizFinal = (double) (Q2+Q3+Q4+Q5)/4;
		} else if (Q2<Q1 && Q2<Q3 && Q2<Q4 && Q2<Q5) { /*Q2 lowest grade*/
			quizFinal = (double) (Q1+Q3+Q4+Q5)/4;
		} else if (Q3<Q1 && Q3<Q2 && Q3<Q4 && Q3<Q5) { /*Q3 lowest grade*/
			quizFinal = (double) (Q1+Q2+Q4+Q5)/4;
		} else if (Q4<Q1 && Q4<Q2 && Q4<Q3 && Q4<Q5) { /*Q4 lowest grade*/
			quizFinal = (double) (Q1+Q2+Q3+Q5)/4;
		} else quizFinal = (double) (Q1+Q2+Q3+Q4)/4;   /*Q5 lowest grade*/

/* Variables: part 2 */
		double A1 = 8.5;
		double A2 = 8.0;
		double A3 = 7.5;
		double project = 8;
		double QA = 7.0;
		double gradeFinal = 0.2*quizFinal + 0.04*A1 + 0.08*A2 + 0.08*A3 + 0.5*project + 0.1*QA;

/* Table_top */
		System.out.println("--------------------------------------------------------------");
		System.out.print("| Quizzes |");
		System.out.print("  A1  |  A2  |  A3  |");
		System.out.println("  QA  |Project| Final |Status|");
		System.out.println("--------------------------------------------------------------");
		

/*Table_bottom*/		
		System.out.print("|   ");
		System.out.printf("%.2f", quizFinal);
		System.out.print("  | ");
		System.out.printf("%.2f", A1);
		System.out.print(" | ");
		System.out.printf("%.2f", A2);
		System.out.print(" | ");
		System.out.printf("%.2f", A3);
		System.out.print(" | ");
		System.out.printf("%.2f", QA);
		System.out.print(" |  ");
		System.out.printf("%.2f", project);
		System.out.print(" | ");
		System.out.printf("%.2f", gradeFinal);
		System.out.print("  | ");
		
		if (gradeFinal > 5.5) {
			System.out.print("Pass");
		} else {
			System.out.print("Fail");
	}
		System.out.println(" | ");
		
		System.out.println("--------------------------------------------------------------");

		

	}

}
