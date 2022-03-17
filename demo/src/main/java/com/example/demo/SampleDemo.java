package com.example.demo;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.RebootInstancesRequest;
import software.amazon.awssdk.services.ec2.model.StartInstancesRequest;
import software.amazon.awssdk.services.ec2.model.StopInstancesRequest;

public class SampleDemo{
	public static void main(String[] args) {
		Region region = Region.US_EAST_1;
		String amiId = "ami-04505e74c0741db8d";
		String instanceId = "i-0d5830aef9abe3730";

		Ec2Client ec2 = Ec2Client.builder()
		        .region(region)
		        .build();
		
		StopInstancesRequest request = StopInstancesRequest.builder()
		        .instanceIds(instanceId)
		        .build();

		ec2.stopInstances(request);
		
//		StartInstancesRequest request = StartInstancesRequest.builder()
//		        .instanceIds(instanceId)
//		        .build();
//
//		ec2.startInstances(request);
		
//		RebootInstancesRequest request = RebootInstancesRequest.builder()
//		        .instanceIds(instanceId)
//		        .build();
//
//		ec2.rebootInstances(request);
	}
}
