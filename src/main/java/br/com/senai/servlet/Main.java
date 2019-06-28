package br.com.senai.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class Main extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Iniciando aplicação...");
        PrintWriter out = response.getWriter();
        out.println("Solicitar acesso a plataforma");
        System.out.println("Sistema iniciado com sucesso...");
    }
}
