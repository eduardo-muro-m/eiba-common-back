package com.evolutio.eiba.common.mapper;

import com.evolutio.component.common.deserializer.RestPage;

import java.util.List;

import org.springframework.data.domain.Page;

public interface MapperResponse<I, O> {

  public O mapEntityToDto(I entity);

  public List<O> mapEntityToDto(List<I> items);

  public default RestPage<O> mapEntityToDto(Page<I> page) {
    List<O> mapEntityToDto = mapEntityToDto(page.getContent());

    return new RestPage<>(mapEntityToDto, page.getPageable(), page.getTotalElements());
  }
}
