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

public enum StageType {
	
	POTENTIAL_INFO("Potential Info"),
	LOAN_APP("Loan Application"),
	PAN_CARD_INFO("Pan Card Info"),
	PAN_CARD_UPLOAD("Pan Card Upload"),
	LOGIN_FEE("Login Fee"),	
	GENERIC_INFO("Generic Info"),	
	FAMILY_INFO("Family Info"),	
	PERMANENT_ADDRESS("Permanent Address"),
	PRESENT_ADDRESS("Present Address"),
	USER_PROFILE("User Profile"),
	EMPLOYER_INFO("Employer Info"),	
	WORK_INFO("Work Info"),
	PSYCHOSOMATIC_INFO("Psychometric Info"),
	PERFIOS_INFO("Perfios Info"),
	NOMINEE_INFO("Nominee Info"),
	CIBIL_INFO("Cibil Info"),
	ADDRESS_PROOF_INFO("Address Proof Info"),
	BANK_INFO("Bank Info"),	
	HEALTH_INFO("Health Info"),
	REFERENCE_INFO("Reference Info"),	
	FORM16_INFO("Form16 Info"),	
	FILE_INFO("File Info"),	
	PHONE_BILL("Phone Bill"),
	ELECTRICITY_BILL("Electricity Bill"),
	PASSPORT("Passport"),
	DRIVING_LICENCE("Driving Licence"),	
	VOTER_ID("Voter Id"),
	LOAN_OFFER("Loan Offer");
    
    private String value;

	private StageType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}	
}
