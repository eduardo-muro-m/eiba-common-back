package com.evolutio.eiba.common.service;

public interface CheckDataAccess<I, O> {

  public O check(I object);
}
