package com.example.cafe.dto;

public class Menus {
    private int id;
    private String type;
    private String ingredient;

    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public String getIngredient() { return ingredient;    }

    public void setId(int id) {
        this.id = id;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setIngredient(String ingredient) { this.ingredient = ingredient;    }


}

