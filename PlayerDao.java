package com.codegnan.cricket.dao;


import java.util.List;

import com.codegnan.cricket.exceptions.PlayerNotFoundException;
import com.codegnan.cricket.model.Player;

// DAO interface that contains CRUD operations related to Player data.

public interface PlayerDao {

    public void save(Player player); // CREATE - add player

    public List<Player> findAll();   // READ all - view all players

    public Player findById(int id) throws PlayerNotFoundException; // READ by ID

    public Player update(Player player) throws PlayerNotFoundException; // UPDATE player

    public void deleteById(int id) throws PlayerNotFoundException; // DELETE player
}
