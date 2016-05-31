package io.burt.jmespath.node;

import io.burt.jmespath.Adapter;

public class AndNode extends OperatorNode {
  public AndNode(JmesPathNode left, JmesPathNode right) {
    super(left, right);
  }

  @Override
  protected <T> T evaluateOne(Adapter<T> adapter, T currentValue) {
    T leftResult = operands()[0].evaluate(adapter, currentValue);
    if (adapter.isTruthy(leftResult)) {
      return operands()[1].evaluate(adapter, currentValue);
    } else {
      return leftResult;
    }
  }
}