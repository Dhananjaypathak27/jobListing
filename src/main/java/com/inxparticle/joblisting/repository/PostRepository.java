package com.inxparticle.joblisting.repository;

import com.inxparticle.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
