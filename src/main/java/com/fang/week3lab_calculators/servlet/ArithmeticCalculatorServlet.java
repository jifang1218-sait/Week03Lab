/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fang.week3lab_calculators.servlet;

import com.fang.week3lab_calculators.utils.StringUtils;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jifang
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        
        String url = "/WEB-INF/arithmeticcalculator.jsp";
        String result = "---";
        request.setAttribute("result", result);
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
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
        
        String url = "/WEB-INF/arithmeticcalculator.jsp";

        String first = request.getParameter("fieldFirst");
        String second = request.getParameter("fieldSecond");
        String action = request.getParameter("action");
        
        String result = "";
        if ((!StringUtils.isNumeric(first)) || (!StringUtils.isNumeric(second))) {
            result = "invalid";
        } else {
            switch (action) {
                case "+" : {
                    result = "" + (StringUtils.toInt(first) + StringUtils.toInt(second));
                } break;
                case "-" : {
                    result = "" + (StringUtils.toInt(first) - StringUtils.toInt(second));
                } break;
                case "*" : {
                    result = "" + (StringUtils.toInt(first) * StringUtils.toInt(second));
                } break;
                case "%" : {
                    result = "" + (StringUtils.toInt(first) % StringUtils.toInt(second));
                } break;
            }
        }
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("result", result);
        
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
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
