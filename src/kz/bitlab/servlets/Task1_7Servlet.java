package kz.bitlab.servlets;

import Model.DBManager;
import Model.Footballer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/task1_7")
public class Task1_7Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Task1-7</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action='/home' method='post'>");

        out.print("<table cellpadding = '20px'>");
        out.print("<tbody>");

        out.print("<tr>");
        out.print("<td>NAME:</td>");
        out.print("<td><input type='text' placeholder='Insert name...' name='f_name'></td>");
        out.print("<tr>");

        out.print("<tr>");
        out.print("<td>SURNAME:</td>");
        out.print("<td><input type='text' placeholder='Insert surname...' name='f_surname'></td>");
        out.print("<tr>");

        out.print("<tr>");
        out.print("<td>CLUB:</td>");
        out.print("<td>");
        out.print("<select name='f_club'>");
        out.print("<option>REAL MADRID FC</option>");
        out.print("<option>PSG</option>");
        out.print("<option>BARCELONA</option>");
        out.print("</select>");
        out.print("</td>");
        out.print("<tr>");

        out.print("<tr>");
        out.print("<td>SALARY:</td>");
        out.print("<td><input type='number' placeholder='Insert salary...' name='f_salary'></td>");
        out.print("<tr>");

        out.print("<tr>");
        out.print("<td>TRANSFER PRICE:</td>");
        out.print("<td><input type='number' placeholder='Insert transfer price...' name='f_transfer'></td>");
        out.print("<tr>");

        out.print("</tbody>");
        out.print("</table>");

        out.print("<button>ADD FOOTBALLER</button>");

        out.print("</form>");

        out.print("<div>");
        ArrayList<Footballer> footballers = DBManager.getAllFootballers();
        for (Footballer value : footballers) {
            out.print("<h1>" + value.getName() + " " + value.getSurname() + "</h1>");
            out.print("Club: " + value.getClub());
            out.print("<br>");
            out.print("Salary: " + value.getSalary());
            out.print("<br>");
            out.print("Transfer price: " + value.getTransferPrice());
        }
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String name = request.getParameter("f_name");
        String surname = request.getParameter("f_surname");
        String club = request.getParameter("f_club");
        int salary = Integer.parseInt(request.getParameter("f_salary"));
        int transfer = Integer.parseInt(request.getParameter("f_transfer"));

        Footballer footballer = new Footballer();
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setClub(club);
        footballer.setSalary(salary);
        footballer.setTransferPrice(transfer);

        DBManager.addFootballer(footballer);
        response.sendRedirect("/task1_7");
    }
}
