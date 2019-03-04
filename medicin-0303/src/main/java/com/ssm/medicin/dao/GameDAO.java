package com.ssm.medicin.dao;

import com.ssm.medicin.pojo.Game;

import java.util.List;

public interface GameDAO {

    int addGame(Game game);

    int deleteGame(Integer id);

    int updateGame(Game game);

    List<Game> getGameList(Game game);

    Game getGameListById(Integer id);


}
