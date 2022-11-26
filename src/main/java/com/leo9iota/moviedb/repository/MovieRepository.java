package com.leo9iota.moviedb.repository;

import com.leo9iota.moviedb.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

}
