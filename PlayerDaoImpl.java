package com.codegnan.cricket.dao;


import java.util.ArrayList;
import java.util.List;

import com.codegnan.cricket.exceptions.PlayerNotFoundException;
import com.codegnan.cricket.model.Player;


public class PlayerDaoImpl implements PlayerDao {

    List<Player> playerList = new ArrayList<>();

    @Override
    public void save(Player player) {
        playerList.add(player);
    }

    @Override
    public List<Player> findAll() {
        return playerList;
    }

    @Override
    public Player findById(int id) throws PlayerNotFoundException {
        for(Player p : playerList) {
            if(p.getId() == id) {
                return p;
            }
        }
        throw new PlayerNotFoundException("Player with Id " + id + " not found.");
    }

    @Override
    public Player update(Player player) throws PlayerNotFoundException {
        for(int i = 0; i < playerList.size(); i++) {
            if(playerList.get(i).getId() == player.getId()) {
                playerList.set(i, player);
                return player;
            }
        }
        throw new PlayerNotFoundException("Player with Id " + player.getId() + " not found — cannot update.");
    }

    @Override
    public void deleteById(int id) throws PlayerNotFoundException {
        boolean found = false;
        for(int i = 0; i < playerList.size(); i++) {
            if(playerList.get(i).getId() == id) {
                playerList.remove(i);
                found = true;
                break;
            }
        }
        if(!found) {
            throw new PlayerNotFoundException("Player with Id " + id + " not found — cannot delete.");
        }
    }
}

