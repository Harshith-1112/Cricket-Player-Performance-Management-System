package com.codegnan.cricket.service;

import java.util.List;

// Service interface — contains business logic level operations.

import com.codegnan.cricket.exceptions.PlayerNotFoundException;
import com.codegnan.cricket.model.Player;


public interface PlayerService {

    public void addPlayer(Player player);

    public List<Player> getAllPlayers();

    public Player getPlayerById(int id) throws PlayerNotFoundException;

    public Player updatePlayer(Player player) throws PlayerNotFoundException;

    public void deletePlayer(int id) throws PlayerNotFoundException;
}
