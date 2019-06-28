package br.com.senai.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class MainTest extends HttpServlet {
    public void mainServletTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Iniciando API no modo de teste...");
        response.getWriter().println("Solicitar token de autenticação no sistema!");
        System.out.println("API iniciada com sucesso...");
    }
}
