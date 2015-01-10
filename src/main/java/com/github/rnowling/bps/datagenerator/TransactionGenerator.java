package com.github.rnowling.bps.datagenerator;

import java.util.Collection;
import java.util.List;

import com.github.rnowling.bps.datagenerator.datamodels.Customer;
import com.github.rnowling.bps.datagenerator.datamodels.Transaction;
import com.github.rnowling.bps.datagenerator.datamodels.Weather;
import com.github.rnowling.bps.datagenerator.datamodels.inputs.ProductCategory;
import com.github.rnowling.bps.datagenerator.framework.SeedFactory;
import com.github.rnowling.bps.datagenerator.framework.samplers.Sampler;
import com.github.rnowling.bps.datagenerator.generators.purchase.PurchasingModel;
import com.github.rnowling.bps.datagenerator.generators.transaction.TransactionSamplerBuilder;

public class TransactionGenerator
{
	Sampler<Transaction> sampler;
	
	public TransactionGenerator(Customer customer, PurchasingModel profile, 
			Collection<ProductCategory> productCategories, List<Weather> weatherTraj,
			SeedFactory seedFactory) throws Exception
	{
		sampler = new TransactionSamplerBuilder(productCategories,
				customer, profile, weatherTraj, seedFactory).build();
	}
	
	public Transaction generate() throws Exception
	{
		return sampler.sample();
	}
}
