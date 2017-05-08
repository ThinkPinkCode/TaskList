package com.melaniecodes.tasklist;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class main {
    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/", (req, res) -> {
            return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
