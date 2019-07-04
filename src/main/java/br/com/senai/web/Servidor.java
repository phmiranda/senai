package br.com.senai.web;

// comentário

import javax.ws.rs.Path;

@Path("/")
public class Servidor {
    public static void main(String[] args) {

        System.out.println("Iniciando API, o ponto inicial é um JSON criado para teste");
    }
}
