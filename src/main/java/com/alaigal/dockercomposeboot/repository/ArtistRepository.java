package com.alaigal.dockercomposeboot.repository;

import com.alaigal.dockercomposeboot.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
