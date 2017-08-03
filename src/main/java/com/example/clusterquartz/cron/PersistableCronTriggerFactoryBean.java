package com.example.clusterquartz.cron;

import java.text.ParseException;

import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

/**
 * @author tianyi
 *
 */
public class PersistableCronTriggerFactoryBean extends CronTriggerFactoryBean
{

	@Override
	public void afterPropertiesSet() throws ParseException
	{
		super.afterPropertiesSet();
		getJobDataMap().remove(getObject().getJobKey().getName());
	}
}


