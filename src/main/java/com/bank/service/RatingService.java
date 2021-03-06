package com.bank.service;

import com.bank.domain.Rating;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Rating.
 */
public interface RatingService {

    /**
     * Save a rating.
     *
     * @param rating the entity to save
     * @return the persisted entity
     */
    Rating save(Rating rating);

    /**
     * Get all the ratings.
     *
     * @return the list of entities
     */
    List<Rating> findAll();


    /**
     * Get the "id" rating.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Rating> findOne(Long id);

    /**
     * Delete the "id" rating.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
