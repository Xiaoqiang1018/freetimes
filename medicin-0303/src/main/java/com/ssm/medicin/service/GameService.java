package com.ssm.medicin.service;

import com.ssm.medicin.pojo.Game;

import java.util.List;

public interface GameService {
    int addGame(Game game);

    int deleteGame(Integer id);

    int updateGame(Game game);

    List<Game> getGameList(Game game);

    Game getGameListById(Integer id);
}
