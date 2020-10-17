package com.delrony.cake_factory.data;

import com.delrony.cake_factory.entity.Catalog;

import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<Catalog, String> {
    
}
