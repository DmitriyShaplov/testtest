package com.example.cafe.resource;

import com.example.cafe.dto.Menus;
import com.example.cafe.dto.exeptions.NotFoundExcept;
import com.example.cafe.mapper.MenuMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
class MessageController {
    private MenuMapper menuMapper;

    public MessageController(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    @PostMapping
    public Menus add(@RequestBody Menus mes) {
//        Menus menu = new Menus();
//        menu.setType(mes.get("type"));
//        menu.setIngredient(mes.get("ingredient"));
        int menu = menuMapper.createMenu(mes);
        return mes;
    }

    @PutMapping("/update/{id}")
    private List<Menus> update(@RequestBody Map<String, String> message) {
        Menus menu = new Menus();
        menu.setType(message.get("type"));
        menu.setId(Integer.parseInt(message.get("id")));
        menu.setIngredient(message.get("ingredient"));
        menuMapper.updateMenu(menu);
        return menuMapper.findAll();
    }

    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable int id) {
       /* Menus menu = new Menus();
        menu.setId(Integer.parseInt("id"));
        */
        menuMapper.deleteMenu(id);

    }

    @GetMapping
    public List<Menus> getAll() {
        return menuMapper.findAll();
    }

    @GetMapping("{id}")
    public Menus getMessage(@PathVariable int id) {
        return getAll().stream()
                .filter(mes -> mes.getId() == id)
                .findFirst()
                .orElseThrow(NotFoundExcept::new);
    }
}

