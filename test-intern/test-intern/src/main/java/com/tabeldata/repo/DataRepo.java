package com.tabeldata.repo;

import com.tabeldata.entity.Data;
import org.springframework.data.repository.CrudRepository;

public interface DataRepo extends CrudRepository<Data, String> {
    
}
