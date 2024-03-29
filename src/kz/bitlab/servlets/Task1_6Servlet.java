package kz.bitlab.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task1_6")
public class Task1_6Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Task1_6</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action='/task1_6' method='post'>");
        out.print("<table cellpadding = '20px'>");
        out.print("<tbody>");

        out.print("<tr>");
        out.print("<td>FULL NAME:</td>");
        out.print("<td><input type = 'text' placeholder='Insert your full name...' name='full_name'></td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>EXAM POINTS:</td>");
        out.print("<td><input type = 'number' name='exam_points'></td>");
        out.print("</tr>");

        out.print("</tbody>");
        out.print("</table>");
        out.print("<button>SUBMIT EXAM</button>");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String fullName = req.getParameter("full_name");
        int points = Integer.parseInt(req.getParameter("exam_points"));
        String result = "F";
        if (points >= 90) {
            result = "A";
        } else if (points >= 75) {
            result = "B";
        } else if (points >= 60) {
            result = "C";
        } else if (points >= 50) {
            result = "D";
        }

        out.print("<h1>"+fullName + " got " + result + " for exam!" +"</h1>");
    }


}
