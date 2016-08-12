package io.burt.jmespath.node;

import io.burt.jmespath.Adapter;

public class JoinNode<T> extends Node<T> {
  public JoinNode(Adapter<T> runtime, Node<T> source) {
    super(runtime, source);
  }

  @Override
  protected boolean isProjection() {
    return false;
  }

  @Override
  protected boolean internalEquals(Object o) {
    return true;
  }

  @Override
  protected int internalHashCode() {
    return 19;
  }
}
