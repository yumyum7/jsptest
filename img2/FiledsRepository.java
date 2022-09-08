package com.cat.img;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FiledsRepository extends JpaRepository<Image, Long> {
	
	Optional<Image> findById(Long id);
}
