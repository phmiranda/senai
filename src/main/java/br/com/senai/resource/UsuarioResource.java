package br.com.senai.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("usuario")
public class UsuarioResource {
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String index(String usuario){
        return usuario;
    }

    @POST
    @Path("/usuario/salvar")
    @Produces(MediaType.APPLICATION_JSON)
    public String salvar(String usuario){
        return usuario;
    }

    @PUT
    @Path("/usuario/editar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String editar(String usuario){
        return usuario;
    }

    @DELETE
    @Path("/usuario/deletar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deletar(String usuario){
        return usuario;
    }

    @GET
    @Path("/usuario/pesquisar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String pesquisar(String usuario){
        return usuario;
    }

    @GET
    @Path("/usuario/pesquisar/{nome}")
    @Produces(MediaType.APPLICATION_JSON)
    public String pesquisarPorNome(String usuario){
        return usuario;
    }
}
