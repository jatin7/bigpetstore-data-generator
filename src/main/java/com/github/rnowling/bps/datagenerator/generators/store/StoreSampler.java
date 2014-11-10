package com.github.rnowling.bps.datagenerator.generators.store;

import com.github.rnowling.bps.datagenerator.datamodels.Store;
import com.github.rnowling.bps.datagenerator.datamodels.inputs.ZipcodeRecord;
import com.github.rnowling.bps.datagenerator.framework.samplers.Sampler;

public class StoreSampler implements Sampler<Store>
{

	private final Sampler<ZipcodeRecord> locationSampler;
	private final Sampler<Integer> idSampler;
	
	public StoreSampler(Sampler<Integer> idSampler, Sampler<ZipcodeRecord> locationSampler)
	{
		this.locationSampler = locationSampler;
		this.idSampler = idSampler;
	}
	
	public Store sample() throws Exception
	{
		Integer id = idSampler.sample();
		String name = "Store_" + id;
		ZipcodeRecord location = locationSampler.sample();
		
		Store store = new Store(id, name, location);
		
		return store;
	}
	
}
