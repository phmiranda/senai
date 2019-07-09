package br.com.senai.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class Bootstrap extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        // comentário
        String nome = request.getParameter("nome");

        // comentário
        response.getWriter().print("Bem vindo: " + nome);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  ServletException,IOException{
        // comentário
        String nome = request.getParameter("nome");

        // comentário
        response.getWriter().print("Bem vindo: " +nome);
    }
}
