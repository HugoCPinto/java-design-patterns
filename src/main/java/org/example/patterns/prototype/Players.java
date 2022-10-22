package org.example.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype pattern
 * when we need to transform a massive data information we SHOULD:
 * 1) get all the data
 * 2) clone and transform the data
 */
public class Players implements Cloneable{

    private List<String> players;

    public Players() {
        players = new ArrayList<>();
    }

    public Players(List<String> players) {
        this.players = players;
    }

    public void loadPlayers() {
        players.add("Cristino Ronaldo");
        players.add("Messi");
    }

    public List<String> getPlayers(){
        return this.players;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> players = new ArrayList<>();
        for(String s : this.getPlayers()){
            players.add(s);
        }
        return new Players(players);
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Players players = new Players();
        players.loadPlayers();

        Players players2 = (Players) players.clone();

        System.out.println("players loaded: " + players.getPlayers());
        System.out.println("players copied: " + players2.getPlayers());
    }
}
