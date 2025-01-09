package com.evolutio.eiba.common.mapper;

import java.util.List;

public interface MapperRequest<I, O> {

  public I mapDtoToEntity(O dto);

  public List<I> mapDtoToEntity(List<O> dto);
}
