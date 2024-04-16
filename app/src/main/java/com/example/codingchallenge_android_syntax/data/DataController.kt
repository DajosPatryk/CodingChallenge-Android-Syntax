package com.example.codingchallenge_android_syntax.data

class DataController {
    private val players: MutableList<Player> = mutableListOf(
        Player("Patryk", "Dajos", 36),
        Player("Lars", "Mustermann", 48),
        Player("Jemand", "Jemand", 64),
        Player("Bester", "Spieler", 128),
        Player("Wer", "Bistdu", 143),

        // GPT generated
        Player("Orion", "Mystico", 88),
        Player("Luna", "Nightsky", 57),
        Player("Corvin", "Crowley", 77),
        Player("Elara", "Hecate", 93),
        Player("Draven", "Moor", 102),
        Player("Selene", "Lunar", 66),
        Player("Raven", "Shadow", 119),
        Player("Morgana", "Fate", 134),
        Player("Astra", "Nebula", 81),
        Player("Cyrus", "Oracle", 98),
        Player("Vesper", "Nocturne", 112),
        Player("Thorne", "Nightshade", 130),
        Player("Sable", "Witch", 120),
        Player("Echo", "Sylvan", 109),
        Player("Nyx", "Starfire", 143)
    )

    /**
     * Adds a player.
     * @param player Player object
     */
    fun addPlayer(player: Player) {
        players.add(player)
    }

    /**
     * Removes a player.
     * @param player Player object
     */
    fun removePlayer(player: Player) {
        players.remove(player)
    }

    /**
     * Returns all players as read-only List.
     * @return List<Player>
     */
    fun getAllPlayers(): List<Player> {
        return players.toList()
    }
}