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

package com.springboot.tutorial.repository;

import java.util.List;
import java.util.Optional;

import com.springboot.tutorial.entity.LoanApplication;
import com.springboot.tutorial.entity.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
	public Optional<LoanApplication> findByUserIdAndApplicationStatus(Long userId, StatusType applicationStatus);

	public Optional<LoanApplication> findByUserId(Long userId);

	public List<LoanApplication> findAllByUserId(Long userId);

	public Optional<LoanApplication> findByLoanId(Long loanId);

	public List<LoanApplication> findByDescriptionIsNotNull();

	public List<LoanApplication> findByApplicationStatus(StatusType status);

	@Query(nativeQuery = true, value = "select * from dhanwan.loan_application where user_id= :userId")
	public List<LoanApplication> findAllByUserIdInSortedOrder(@Param(value = "userId") Long userId);

	
}
