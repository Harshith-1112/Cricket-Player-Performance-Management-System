package com.codegnan.cricket.controller;

import java.util.List;

import com.codegnan.cricket.exceptions.PlayerNotFoundException;
import com.codegnan.cricket.model.Player;
import com.codegnan.cricket.service.PlayerService;
import com.codegnan.cricket.service.PlayerServiceImpl;

// Controller class — contains the main method and performs CRUD
// operations by communicating with the Service layer.

public class PlayerController {

    public static void main(String[] args) {
    	
    	// Creating service object to access CRUD operations

        PlayerService service = new PlayerServiceImpl();

        // Add players
        service.addPlayer(new Player(1, "Rohit Sharma", "Batsman", 9200, 8));
        service.addPlayer(new Player(2, "Virat Kohli", "Batsman", 13000, 4));
        service.addPlayer(new Player(3, "Jasprit Bumrah", "Bowler", 200, 350));
        service.addPlayer(new Player(4, "Ravindra Jadeja", "All-rounder", 2600, 220));
        service.addPlayer(new Player(5, "MS Dhoni", "Wicket-Keeper", 10500, 1));
        service.addPlayer(new Player(6, "Hardik Pandya", "All-rounder", 1700, 70));

        System.out.println("Players added successfully");
        System.out.println("All Players");
        System.out.println("++++++++++++++++++++++++++");

        // DISPLAY ALL PLAYERS
        
        List<Player> players = service.getAllPlayers();
        for (Player p : players) {
            System.out.println(p);
        }

        // GET PLAYER BY ID 6
        System.out.println("\nFetching Player with ID: 6");
        try {
            Player fetchPlayer = service.getPlayerById(6);
            System.out.println(fetchPlayer);
        } catch (PlayerNotFoundException e) {
            e.printStackTrace();
        }

        // UPDATE PLAYER with ID 3
        System.out.println("\nUpdating Player with ID: 3");
        try {
            Player updated = service.updatePlayer(new Player(3, "Jasprit Bumrah", "Bowler", 240, 380));
            System.out.println("Updated Player: " + updated);
        } catch (PlayerNotFoundException e) {
            e.printStackTrace();
        }

        // DELETE PLAYER with ID 2
        System.out.println("\nDeleting Player with ID: 2");
        try {
            service.deletePlayer(2);
            System.out.println("Player deleted successfully");
        } catch (PlayerNotFoundException e) {
            e.printStackTrace();
        }

        // After all modification Final Optput
        System.out.println("\nAfter all modifications, final player list:");
        System.out.println("++++++++++++++++++++++++++");

        List<Player> finalPlayers = service.getAllPlayers();
        for (Player p : finalPlayers) {
            System.out.println(p);
        }
    }
}
