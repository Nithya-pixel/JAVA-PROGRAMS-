package com.student.servlet;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        // Simple validation
        if(name == null || name.isEmpty() ||
           email == null || !email.contains("@") ||
           course == null || course.isEmpty()) {

            request.setAttribute("error", "Please fill all fields correctly.");
            RequestDispatcher rd = request.getRequestDispatcher("StudentRegistrationSystem.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("studentName", name);
            request.setAttribute("studentEmail", email);
            request.setAttribute("studentCourse", course);
            RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
            rd.forward(request, response);
        }
    }
}
