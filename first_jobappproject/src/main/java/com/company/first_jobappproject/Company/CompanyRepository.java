package com.company.first_jobappproject.Company;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository  extends JpaRepository<Company,Long> {

}
