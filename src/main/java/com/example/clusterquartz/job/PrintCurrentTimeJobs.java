package com.example.clusterquartz.job;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.example.clusterquartz.utils.DateUtils;

/**
 * @author tianyi
 *
 */
public class PrintCurrentTimeJobs extends QuartzJobBean
{
	private static final Log LOG_RECORD = LogFactory.getLog(PrintCurrentTimeJobs.class);

	@Autowired
	private ClusterQuartz clusterQuartz;


	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException
	{
		LOG_RECORD.info("begin to execute task," + DateUtils.dateToString(new Date()));

		clusterQuartz.printUserInfo();

		LOG_RECORD.info("end to execute task," + DateUtils.dateToString(new Date()));

	}
}
