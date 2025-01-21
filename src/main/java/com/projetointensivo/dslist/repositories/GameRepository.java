package com.projetointensivo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointensivo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
