package com.revature.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {
	

}
