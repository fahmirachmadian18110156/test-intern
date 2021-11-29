package com.tabeldata.service;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import com.tabeldata.entity.Data;
import com.tabeldata.repo.DataRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DataService {

    @Autowired
    private DataRepo repo;

    public Iterable<Data> findAll(){
        return repo.findAll();
    }
}
