package com.theironyard.services;

import com.theironyard.entities.Image;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by john.tumminelli on 10/28/16.
 */
public interface ImageRepository extends CrudRepository<Image, Integer> {
}
