package com.codegnan.cricket.dao;


import java.util.List;

import com.codegnan.cricket.exceptions.PlayerNotFoundException;
import com.codegnan.cricket.model.Player;

public interface PlayerDao {

    public void save(Player player); // CREATE

    public List<Player> findAll();   // READ all

    public Player findById(int id) throws PlayerNotFoundException; // READ by ID

    public Player update(Player player) throws PlayerNotFoundException; // UPDATE

    public void deleteById(int id) throws PlayerNotFoundException; // DELETE
}
