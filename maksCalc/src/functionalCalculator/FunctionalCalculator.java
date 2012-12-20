package functionalCalculator;

import java.util.ArrayList;
import java.util.List;

public class FunctionalCalculator implements Modes {
	private double argument;
	private double startSegment, endSegment, step;
	
	public void setArgument( double argument ){
		this.argument = argument;
	}
	
	public double getArgument(){
		return argument;
	}
	
	public void setStartSegment( double startSegment ){
		this.startSegment = startSegment;
	}
	
	public double getStartSegment(){
		return startSegment;
	}
	
	public void setEndSegment( double endSegment ){
		this.endSegment = endSegment;
	}
	
	public double getEndSegment(){
		return endSegment;
	}
	
	public void setStep( double step ){
		this.step = step;
	}
	
	public double getStep(){
		return step;
	}
	
	@Override
	public List<Double> calculatedWithSteps( Function function ) {
		double currentSegment = startSegment;
		List<Double> resultList = new ArrayList<Double>();
		while( currentSegment <= endSegment ){
			resultList.add( function.calculate(currentSegment) );
			currentSegment += step;
		}
		return resultList;
	}

	@Override
	public double normalCalculate( Function function ) {
		return function.calculate( argument );
	}
	
	public void resultConsoleOutput(){
		System.out.println();
	}
}
