package com.develhope.Interceptor_Middleware_02.services;

import com.develhope.Interceptor_Middleware_02.entities.Month;
import com.develhope.Interceptor_Middleware_02.repositories.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MonthService {
    @Autowired
    private MonthRepository monthRepository;

    public Month createMonth(Month month){
        return monthRepository.save(month);
    }


    public Optional<Month> deleteById(Long id) {
        Optional<Month> month1 = monthRepository.findById(id);
        if (month1.isPresent()) {
            monthRepository.delete(month1.get());
        } else {
            return Optional.empty();

        }
        return month1;
    }
}
