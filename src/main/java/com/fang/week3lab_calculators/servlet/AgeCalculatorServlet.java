/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fang.week3lab_calculators.servlet;

import com.fang.week3lab_calculators.entity.User;
import com.fang.week3lab_calculators.utils.StringUtils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jifang
 */
public class AgeCalculatorServlet extends HttpServlet {

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
        
        String url="/agecalculator.jsp";
        String strAge = request.getParameter("ageField");
        String result = "";
        if (strAge.length() <= 0) {
            result = "You must give your current age.";
        } else if (!StringUtils.isNumeric(strAge)) {
            result = "You must enter a number.";
        } else {
            int age = StringUtils.toInt(strAge);
            User user = new User();
            user.setAge(age);
            result = "Your age next birthday will be " + (user.getAge() + 1);
        }
        
        request.setAttribute("result", result);
        getServletContext()
                .getRequestDispatcher(url).
                forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        
        String url="/agecalculator.jsp";
        
        getServletContext()
                .getRequestDispatcher(url).
                forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        
        String url="/agecalculator.jsp";
        String strAge = request.getParameter("ageField");
        String result = "";
        if (strAge.length() <= 0) {
            result = "You must give your current age.";
        } else if (!StringUtils.isNumeric(strAge)) {
            result = "You must enter a number.";
        } else {
            int age = StringUtils.toInt(strAge);
            User user = new User();
            user.setAge(age);
            result = "Your age next birthday will be " + (user.getAge() + 1);
        }
        
        request.setAttribute("result", result);
        request.setAttribute("age", strAge);
        getServletContext()
                .getRequestDispatcher(url).
                forward(request, response);
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
