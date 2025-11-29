package com.codegnan.cricket.service;

import java.util.List;

import com.codegnan.cricket.dao.PlayerDao;
import com.codegnan.cricket.dao.PlayerDaoImpl;
import com.codegnan.cricket.exceptions.PlayerNotFoundException;
import com.codegnan.cricket.model.Player;

//Service implementation which calls DAO methods.
//Acts as a middle layer between controller and DAO.

public class PlayerServiceImpl implements PlayerService {

    PlayerDao dao = new PlayerDaoImpl(); // dependency injection of DAO

    @Override
    public void addPlayer(Player player) {
        dao.save(player);
    }

    @Override
    public List<Player> getAllPlayers() {
        return dao.findAll();
    }

    @Override
    public Player getPlayerById(int id) throws PlayerNotFoundException {
        return dao.findById(id);
    }

    @Override
    public Player updatePlayer(Player player) throws PlayerNotFoundException {
        return dao.update(player);
    }

    @Override
    public void deletePlayer(int id) throws PlayerNotFoundException {
        dao.deleteById(id);
    }
}
