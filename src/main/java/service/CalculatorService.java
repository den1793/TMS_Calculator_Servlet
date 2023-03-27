package service;

import entity.Operation;
import entity.OperationType;
import storage.JDBCOperationStorage;
import storage.OperationStorage;

import java.io.IOException;
import java.util.List;


/**
 * @author Denis Smirnov
 */
public class CalculatorService {
    private final OperationStorage storage = new JDBCOperationStorage();

    public Operation calculate(Operation operation) throws IOException {
        switch (OperationType.valueOf(operation.getType())) {
            case SUM:
                operation.setResult(operation.getNum1() + operation.getNum2());
                storage.save(operation);
                return operation;
            case SUB:
                operation.setResult(operation.getNum1() - operation.getNum2());
                storage.save(operation);
                return operation;
            case MUL:
                operation.setResult(operation.getNum1() * operation.getNum2());
                storage.save(operation);
                return operation;
            case DIV:
                operation.setResult(operation.getNum1() / operation.getNum2());
                storage.save(operation);
                return operation;
        }
        return operation;
    }
    public List<Operation> findAll() throws IOException {
        return storage.findAll();
    }
}
