package com.ssm.medicin.service.impl;

import com.ssm.medicin.dao.GameDAO;
import com.ssm.medicin.pojo.Game;
import com.ssm.medicin.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameDAO gameDAO;

    @Override
    public int addGame(Game game) {
        return gameDAO.addGame(game);
    }

    @Override
    public int deleteGame(Integer id) {
        return gameDAO.deleteGame(id);
    }

    @Override
    public int updateGame(Game game) {
        return gameDAO.updateGame(game);
    }

    @Override
    public List<Game> getGameList(Game game) {
        return gameDAO.getGameList(game);
    }

    @Override
    public Game getGameListById(Integer id) {
        return gameDAO.getGameListById(id);
    }
}
