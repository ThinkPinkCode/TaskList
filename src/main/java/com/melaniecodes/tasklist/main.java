package com.melaniecodes.tasklist;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

public class main {
    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/", (req, res) -> {
            return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/chooseName", (req, res) -> {
            return new ModelAndView(null, "chooseName.hbs");
        }, new HandlebarsTemplateEngine());

        post("/list", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            model.put("listName", "List Name");
            return new ModelAndView (model, "list.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
