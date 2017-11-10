package com.goit.spring.off2.repository;

import com.goit.spring.off2.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    @Query("select d from Developer d where d.firstName like %?1% or d.lastName like %?1%")
    List<Developer> search(String text);

    @Query(value = "SELECT * from Developer WHERE FIRST_NAME LIKE %?1% or LAST_NAME LIKE %?1%", nativeQuery = true)
    List<Developer> nativeSearch(String text);

    List<Developer> findByFirstName(String firstName);
}
