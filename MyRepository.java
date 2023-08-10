package com.Demo.APItestingPostman;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<Student,Integer> {

	String deleteById(int id);

}
