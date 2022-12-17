package org.sid.inventoryservice.repository;

import org.sid.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//pour exposer ca sous forme d'un web service on utilisera RepositoryRestRessourec
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {



}
