package functionalCalculator;

public class CubeRoot extends Function {
	@Override
	double calculate( double argument ) {
		return Math.cbrt( argument );
	}
}
