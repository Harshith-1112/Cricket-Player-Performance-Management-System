package com.codegnan.cricket.model;

public class Player {

    private int id;       // player ID
    private String name;  // Player name
    private String role;  // Player role (Batsman / Bowler / All-rounder / Wicket-Keeper)
    private int runs;     // Total career runs
    private int wickets;  // Total career wickets

    // Default constructor
    
    public Player() {
        super();
    }
    
    // Parameterized constructor
    
    
    public Player(int id, String name, String role, int runs, int wickets) {
        super();
        this.id = id;
        this.name = name;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
    }
    
    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    // Printing player details using toString method
    
    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", role=" + role + ", runs=" + runs + ", wickets=" + wickets + "]";
    }
}

