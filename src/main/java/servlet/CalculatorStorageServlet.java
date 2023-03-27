package servlet;

import entity.Operation;
import storage.JDBCOperationStorage;
import storage.OperationStorage;

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
@WebServlet("/calc/storage")
public class CalculatorStorageServlet extends HttpServlet {

    private final OperationStorage storage = new JDBCOperationStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Operation> all = storage.findAll();
        for (Operation operation : all) {
            resp.getWriter().print(operation.toString() + "\n");
        }

    }
}