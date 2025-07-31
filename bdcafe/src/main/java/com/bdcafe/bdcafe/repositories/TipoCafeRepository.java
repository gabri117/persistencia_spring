package com.bdcafe.bdcafe.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bdcafe.bdcafe.entities.TipoCafe;

public interface TipoCafeRepository extends JpaRepository<TipoCafe, Integer> {
    

}
