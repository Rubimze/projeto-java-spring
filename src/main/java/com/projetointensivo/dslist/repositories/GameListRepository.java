package com.projetointensivo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointensivo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
