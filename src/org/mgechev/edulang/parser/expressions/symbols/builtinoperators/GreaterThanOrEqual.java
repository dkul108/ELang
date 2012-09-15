package org.mgechev.edulang.parser.expressions.symbols.builtinoperators;

import org.mgechev.edulang.parser.expressions.IExpression;
import org.mgechev.edulang.parser.expressions.symbols.BooleanValue;
import org.mgechev.edulang.parser.expressions.symbols.Value;

public class GreaterThanOrEqual extends BuiltInOperator {
    
    public GreaterThanOrEqual() {
        super(2);
    }
    
    public Value<Boolean> evaluate() {
        Double arg1 = (Double)((IExpression) this.args.pop()).evaluate().getValue();
        Double arg2 = (Double)((IExpression) this.args.pop()).evaluate().getValue();
        return new BooleanValue(arg1 >= arg2);
    }
}