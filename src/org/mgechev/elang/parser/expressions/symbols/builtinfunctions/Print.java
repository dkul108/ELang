package org.mgechev.elang.parser.expressions.symbols.builtinfunctions;

import org.mgechev.elang.parser.expressions.IExpression;
import org.mgechev.elang.parser.expressions.symbols.Value;

public class Print implements IExpression {

    private IExpression toPrint;
    
    public Print(IExpression toPrint) {
        this.toPrint = toPrint;
    }
    
    public Value evaluate() {
        Value result = this.toPrint.evaluate();
        System.out.print(result.getValue());
        return result;
    }
    
}
