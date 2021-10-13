package com.edu.escuelaing.arep.ec2aws;
import static spark.Spark.*;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class WebServer {
    private static Services services = new Services();

    /**
     * Metodo main del proyecto, el cual nos devuelve los diferentes resultados
     * dependiendo de la extension del get
     * @param args
     */
    public static void main(String[] args){
        JSONObject jsonObject = new JSONObject();
        port(getPort());

        get("/asin", (req, res) -> {
            Double value = Double.valueOf(req.queryParams("value"));
            Double asinValue = services.asin(value);
            jsonObject.put("operation", "asin");
            jsonObject.put("input", value);
            jsonObject.put("output", asinValue);
            return jsonObject.toJSONString();
        });

      
        get("/acos",(req, res) -> {
            Double value = Double.valueOf(req.queryParams("value"));
            Double acosValue = services.acos(value);
            jsonObject.put("operation", "acos");
            jsonObject.put("input", value);
            jsonObject.put("output", acosValue);
            return jsonObject.toJSONString();
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
