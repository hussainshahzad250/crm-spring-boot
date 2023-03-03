/*************************************************************************
* 
* SATIN CREDITCARE NETWORK LIMITED CONFIDENTIAL
* __________________
* 
*  [2018] SATIN CREDITCARE NETWORK LIMITED
*  All Rights Reserved.
* 
* NOTICE:  All information contained herein is, and remains the property of SATIN CREDITCARE NETWORK LIMITED, and
* The intellectual and technical concepts contained herein are proprietary to SATIN CREDITCARE NETWORK LIMITED
* and may be covered by India and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
* Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission
* is obtained from SATIN CREDITCARE NETWORK LIMITED.
*/


package com.springboot.tutorial.entity;

public enum EmploymentType {
	
	SALARIED("Salaried"),
	SELF_EMPLOYED("Self Employed"),
	OTHERS("Others"),
	STUDENT("Student");
	
	private String description;
	
	EmploymentType(String description){
		this.description=description;
	}

	public String getDescription() {
		return description;
	}

	 void setDescription(String description) {
		this.description = description;
	}
	
}
