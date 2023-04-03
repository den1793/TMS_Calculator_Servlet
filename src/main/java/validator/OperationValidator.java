package validator;

import java.util.regex.Pattern;

/**
 * @author Denis Smirnov
 */
public class OperationValidator {

    private static final Pattern NUM = Pattern.compile("[0-9]*.?[0-9]+");



    public boolean validNum(String num) { return NUM.matcher(num).matches(); }


}
