package com.ssm.medicin.controller;

import com.ssm.medicin.pojo.Game;
import com.ssm.medicin.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class GameController {
    @Autowired
    private GameService gameService;

    @RequestMapping("addGame.html")
    public String addGame(Game game, Map map) {
        int i = gameService.addGame(game);
        if (i == 1) {
            map.put("message", "添加成功");
            return "redirect:ListGame.html";
        }
        map.put("message", "添加失败");
        return "jsp/AddGame.jsp";
    }

    @RequestMapping("index.html")
    public String index() {
        return "jsp/AddGame.jsp";
    }

    @RequestMapping("ListGame.html")
    public String listGame(Game game, Map map) {
        List<Game> gameList = gameService.getGameList(game);
        map.put("gameList", gameList);
        return "jsp/ListGame.jsp";
    }

    @RequestMapping("delete.html")
    public String delete(Integer id, Map map) {
        int i = gameService.deleteGame(id);
        if (i == 1) {
            map.put("message", "删除成功");
            return "redirect:ListGame.html";
        }
        map.put("message", "删除失败");
        return "ListGame.html";
    }

    @RequestMapping("updateGet.html")
    public String update(Integer id, Map map) {
        Game gameListById = gameService.getGameListById(id);
        map.put("gameListById", gameListById);
        return "jsp/updateGame.jsp";
    }

    @RequestMapping("updateGame.html")
    public String modify(Game game, Map map) {
        int i = gameService.updateGame(game);
        if (i == 1) {
            map.put("message", "修改成功");
            return "redirect:ListGame.html";
        }
        map.put("message", "修改失败");
        return "jsp/updateGame.jsp";
    }

}
