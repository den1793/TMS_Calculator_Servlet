package filter;

import validator.OperationValidator;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Denis Smirnov
 */

@WebFilter(servletNames = "CalculatorServlet")
public class CalculatorFilter extends HttpFilter {

    private final OperationValidator operationValidator = new OperationValidator();

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {

        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String type = req.getParameter("type");

        if(operationValidator.validNum(num1) & operationValidator.validNum(num2) & operationValidator.validOperationType(type.toUpperCase())) {
            chain.doFilter(req, res);
        } else {
            res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid request!");
        }
    }
}
