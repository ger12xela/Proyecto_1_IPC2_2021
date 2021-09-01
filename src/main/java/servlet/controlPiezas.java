/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taller.Piezas;
import taller.PiezasDAO;

/**
 *
 * @author Gerson Reynoso
 */
public class controlPiezas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PiezasDAO piezasDAO = new PiezasDAO();
        String accion;
        RequestDispatcher dispacher = null;

        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {

            dispacher = request.getRequestDispatcher("jsp/pagina-taller.jsp");
            List<Piezas> listaPiezas = piezasDAO.listarPiezas();
            request.setAttribute("lista", listaPiezas);
                  
        }
        
        dispacher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
