/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lloyd
 */
public class adding extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
           
           
            
            String Name = request.getParameter("name");
            String Middle = request.getParameter("middle");
            String Surname = request.getParameter("surname");
            String DateOfBirth = request.getParameter("bday");
            String Gender = request.getParameter("gender");
            String Race = request.getParameter("race");
            String Phone = request.getParameter("phone");
            String AlternativeNumber =request.getParameter("alt");
            String Email = request.getParameter("email");
            String Street = request.getParameter("street");
            String Province = request.getParameter("Province");
            String Municipality = request.getParameter("Municipality");
            String City =request.getParameter("City");
            String Code = request.getParameter("code");
            String Street1 = request.getParameter("street1");
            String Province1 = request.getParameter("_Province");
            String Municipality1 = request.getParameter("_Municipality");
            String City1 =request.getParameter("_City");
            String Code1 = request.getParameter("code1");

            
            
            
            
            MyDb Db = new MyDb();
            
            Connection conn = Db.getCon();
            Statement stmt = conn.createStatement();
            String sql = "insert into register values (' "+Name+"', '"+Middle+"', '"+Surname+"', '"+DateOfBirth+"', '"+Gender+"', '"+Race+"', '"+Phone+"', '"+AlternativeNumber+"', '"+Email+"', '"+Street+"', '"+Province+"', '"+Municipality+"', '"+City+"', '"+Code+"', '"+Street1+"', '"+Province1+"', '"+Municipality1+"', '"+City1+"', '"+Code1+"')";
            stmt.executeUpdate(sql);
            response.sendRedirect("QualificationPage_1.html"); 
            
        } catch (SQLException ex) {
            Logger.getLogger(adding.class.getName()).log(Level.SEVERE, null, ex);
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
