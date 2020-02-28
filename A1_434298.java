
// First Assignment of the 'Programming for Managers' course. MSc Business Information Management, Erasmus University
// A1 Goal: Develop a code that computes the final grade for the course. 
// Notes: 	For quizFinal, the 4 highest grades will be taken in consideration
// 			The layout of the console should be the exact same as provided in the assignment description
			

public class A1_434298 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Variables: quizFinal	
		int Q1 = 10;
		int Q2 = 10;
		int Q3 = 9;
		int Q4 = 6;
		int Q5 = 8;
		double quizFinal;
		
// quizFinal: function to obtain the 4 highest grades (this is before we got to know how to use loops)
		if (Q1<Q2 && Q1<Q3 && Q1<Q4 && Q1<Q5) {        //Q1 lowest grade, leave it out
			quizFinal = (double) (Q2+Q3+Q4+Q5)/4;
		} else if (Q2<Q1 && Q2<Q3 && Q2<Q4 && Q2<Q5) { //Q2 lowest grade, leave it out
			quizFinal = (double) (Q1+Q3+Q4+Q5)/4;
		} else if (Q3<Q1 && Q3<Q2 && Q3<Q4 && Q3<Q5) { //Q3 lowest grade, leave it out
			quizFinal = (double) (Q1+Q2+Q4+Q5)/4;
		} else if (Q4<Q1 && Q4<Q2 && Q4<Q3 && Q4<Q5) { //Q4 lowest grade, leave it out
			quizFinal = (double) (Q1+Q2+Q3+Q5)/4;
		} else quizFinal = (double) (Q1+Q2+Q3+Q4)/4;   //Q5 lowest grade, leave it out

// Variables:
		double A1 = 8.5;
		double A2 = 8.0;
		double A3 = 7.5;
		double project = 8;
		double QA = 7.0;
		double gradeFinal = 0.2*quizFinal + 0.04*A1 + 0.08*A2 + 0.08*A3 + 0.5*project + 0.1*QA;

// Table_top (layout)
		System.out.println("--------------------------------------------------------------");
		System.out.print("| Quizzes |");
		System.out.print("  A1  |  A2  |  A3  |");
		System.out.println("  QA  |Project| Final |Status|");
		System.out.println("--------------------------------------------------------------");
		

//Table_bottom (layout)	
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

// Add a pass/fail
		if (gradeFinal > 5.5) {
			System.out.print("Pass");
		} else {
			System.out.print("Fail");
	}
		System.out.println(" | ");
		
		System.out.println("--------------------------------------------------------------");

		

	}

}
