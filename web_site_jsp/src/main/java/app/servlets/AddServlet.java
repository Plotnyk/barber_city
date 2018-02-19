package app.servlets;

import app.controller.Model;
import app.model.entity.person.Account;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.include(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("pass");
        Account account = new Account(name, password);
        Model model = Model.getInstance();
        model.add(account);

        req.setAttribute("userName", name);
        doGet(req, resp);

    }

}
