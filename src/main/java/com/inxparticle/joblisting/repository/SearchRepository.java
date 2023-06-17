package com.inxparticle.joblisting.repository;

import com.inxparticle.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
