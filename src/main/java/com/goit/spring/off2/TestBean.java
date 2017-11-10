package com.goit.spring.off2;

import com.goit.spring.off2.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TestBean {
    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public String toString() {
        return "HHH";
    }
}
