package com.horse.race.repository;

import com.horse.race.entity.Work;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends MongoRepository<Work, String> {

}
