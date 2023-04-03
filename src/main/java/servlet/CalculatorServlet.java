package servlet;

import entity.Operation;
import service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Denis Smirnov
 */
@WebServlet(name = "CalculatorServlet", value = "/calc")
public class CalculatorServlet extends HttpServlet {
    private final CalculatorService calculatorService = new CalculatorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/calc.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String type = req.getParameter("type").toUpperCase();


        Operation operation = calculatorService.calculate(new Operation(num1, num2, type));

        req.setAttribute("result", operation.getResult());
        req.getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
    }
}
