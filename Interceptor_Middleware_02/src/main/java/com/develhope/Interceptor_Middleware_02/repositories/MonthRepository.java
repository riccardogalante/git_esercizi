package com.develhope.Interceptor_Middleware_02.repositories;

import com.develhope.Interceptor_Middleware_02.entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<Month,Long> {
}
