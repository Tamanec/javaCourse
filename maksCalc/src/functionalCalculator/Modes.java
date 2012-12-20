package functionalCalculator;

import java.util.List;

public interface Modes {
	List<Double> calculatedWithSteps( Function function );
	double normalCalculate( Function function );
}