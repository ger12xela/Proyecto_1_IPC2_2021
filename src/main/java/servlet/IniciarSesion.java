/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import conector.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gerson Reynoso
 */
public class IniciarSesion extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        Consultas consulta = new Consultas();
        System.out.println("servlet.IniciarSesion.processRequest()");
        if (consulta.autenticacion(usuario, password)) {
            System.out.println(consulta.getTipo(usuario));
            Consultas con = new Consultas();
            switch (con.getTipo(usuario)) {

                case 1:
                    response.sendRedirect("jsp/pagina-taller.jsp");
                    System.out.println(consulta.getTipo(usuario));
                    break;

                case 2:
                    response.sendRedirect("jsp/Ventas.jsp");
                    System.out.println(consulta.getTipo(usuario));
                    break;
                case 3:
                    response.sendRedirect("jsp/financiero.jsp");
                    System.out.println(consulta.getTipo(usuario));
                    break;
                default:
                    response.sendRedirect("jsp/errorusuario.jsp");
                    System.out.println(consulta.getTipo(usuario)+"----hola este es el busco");
            }
        } else {
            response.sendRedirect("jsp/login.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
