package com.kenzie.appserver.service;

import com.kenzie.appserver.repositories.PlayerRepository;
import com.kenzie.appserver.service.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {


    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return (List<Player>) playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(long id) {
        return Optional.ofNullable(playerRepository.findById(String.valueOf(id)));
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Player player) {
        playerRepository.delete(String.valueOf(player));
    }
}