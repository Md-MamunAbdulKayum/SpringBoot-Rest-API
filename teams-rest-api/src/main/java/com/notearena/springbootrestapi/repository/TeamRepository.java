package com.notearena.springbootrestapi.repository;



import org.springframework.data.repository.CrudRepository;

import com.notearena.springbootrestapi.model.Team;

public interface TeamRepository extends CrudRepository<Team, String>{

}
