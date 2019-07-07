package br.com.senai.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

// caminho principal da funcionalidade de gerenciamento de usuários
@Path("/empresa")
public class UsuarioResource {
    // listagem de todos os registros
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public String index(String usuarios){
        return usuarios;
    }

    // comentário
}
