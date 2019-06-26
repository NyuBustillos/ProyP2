/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Bean;
import Modelo.Dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Obustillosh
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
        int opcion=Integer.parseInt(request.getParameter("txtOPCION"));
        String id=request.getParameter("id_producto");
        String nombre=request.getParameter("nombre_producto");
        String precio=request.getParameter("precio_producto");
        
        Bean B=new Bean(id,nombre,precio);
        Dao D=new Dao(B);
        ResultSet rs;
        
        String mBien="Operacion exitosa";
        String mMal="Operacion fallida";
        
        switch (opcion){
            case 1:
                if (D.agrear()){
                    request.setAttribute("mensaje",mBien);
                }else{request.setAttribute("mensaje", mMal);}
                request.getRequestDispatcher("FOrmularioProducto.jsp").forward(request, response);
                break;
            case 2:
                if (D.borrar()){
                    request.setAttribute("mensaje",mBien);
                }else{request.setAttribute("mensaje", mMal);}
                request.getRequestDispatcher("FOrmularioProducto.jsp").forward(request, response);
                break;
            case 3:
                if (D.actualizarRegistro()){
                    request.setAttribute("mensaje",mBien);
                }else{request.setAttribute("mensaje", mMal);}
                request.getRequestDispatcher("FOrmularioProducto.jsp").forward(request, response);
                break;
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
