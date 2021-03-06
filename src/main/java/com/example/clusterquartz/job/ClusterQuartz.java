package com.example.clusterquartz.job;

import java.util.Date;

import org.springframework.stereotype.Controller;

import com.example.clusterquartz.utils.DateUtils;

/**
 * @author tianyi
 *
 */
@Controller
public class ClusterQuartz {

	public void printUserInfo() {
		System.out.println("***      start " + DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss:SSS") + "    *************");

		System.out.println("*");
		System.out.println("*        current username is " + System.getProperty("user.name"));
		System.out.println("*        current os name is " + System.getProperty("os.name"));
		System.out.println("*");

		System.out.println("*********current user information end******************");
	}

}
