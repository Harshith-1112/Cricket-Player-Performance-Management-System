package com.codegnan.cricket.model;

public class Player {

    private int id;
    private String name;
    private String role;    // Batsman/Bowler/All-rounder
    private int runs;
    private int wickets;

    public Player() {
        super();
    }

    public Player(int id, String name, String role, int runs, int wickets) {
        super();
        this.id = id;
        this.name = name;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
    }

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

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", role=" + role + ", runs=" + runs + ", wickets=" + wickets + "]";
    }
}

