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
@WebServlet(value = "/calc", name = "CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    private final CalculatorService calculatorService = new CalculatorService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sNum1 = req.getParameter("num1");
        String sNum2 = req.getParameter("num2");
        String type = req.getParameter("operation-type").toUpperCase();

        double num1 = Double.parseDouble(sNum1);
        double num2 = Double.parseDouble(sNum2);

        Operation operation = calculatorService.calculate(new Operation(num1,num2,type));


        resp.getWriter().print(operation.getResult());



    }
}
