package servlet;

import entity.Operation;
import service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Denis Smirnov
 */
@WebServlet("/history")
public class CalculatorStorageServlet extends HttpServlet {

    private final CalculatorService calculatorService = new CalculatorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Operation> all = calculatorService.findAll();
        StringBuilder operationBuilder = new StringBuilder();
        for (Operation operation : all) {
            String operationList = operation.getNum1() + " " + operation.getType() + " " + operation.getNum2() + " result " + operation.getResult();
            operationBuilder.append(operationList);
            operationBuilder.append("\n");

        }

        String historyOfOperation = operationBuilder.toString();
        resp.getWriter().print(historyOfOperation);

    }
}


