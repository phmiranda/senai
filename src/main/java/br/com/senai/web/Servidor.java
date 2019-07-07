package br.com.senai.web;

// comentário

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Servidor {
    @GET
    public String index(String content) {
        return  content;
    }
}
