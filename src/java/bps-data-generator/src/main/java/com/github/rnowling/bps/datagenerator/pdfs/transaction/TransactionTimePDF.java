package com.github.rnowling.bps.datagenerator.pdfs.transaction;

import com.github.rnowling.bps.datagenerator.statistics.pdfs.ConditionalProbabilityDensityFunction;
import com.github.rnowling.bps.datagenerator.statistics.pdfs.ProbabilityDensityFunction;

public class TransactionTimePDF implements ConditionalProbabilityDensityFunction<Double, Double>
{	
	public double probability(Double lastTransactionTime, Double proposedTime)
	{
		return fixConditional(lastTransactionTime).probability(lastTransactionTime);
	}
	
	public ProbabilityDensityFunction<Double> fixConditional(final Double lastTransactionTime)
	{
		return new ProbabilityDensityFunction<Double>()
			{
				public double probability(Double proposedTransactionTime)
				{
					if(proposedTransactionTime >= lastTransactionTime)
					{
						return 1.0;
					}
					else
					{
						return 0.0;
					}
				}
			};
	}
}
