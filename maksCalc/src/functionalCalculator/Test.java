package functionalCalculator;

public class Test {
	public static void main(String[] args) {
		FunctionalCalculator fc = new FunctionalCalculator();
		Cosine cosin = new Cosine();
		CubeRoot cr = new CubeRoot();
		fc.setArgument(32);
		fc.setStartSegment(1);
		fc.setEndSegment(10);
		fc.setStep(1);
		System.out.println( fc.normalCalculate(cosin) );
		System.out.println( fc.normalCalculate(cr) );
		fc.setArgument(81);
		System.out.println( fc.calculatedWithSteps(cr) );
		System.out.println( fc.normalCalculate(cr) );
	}

}
