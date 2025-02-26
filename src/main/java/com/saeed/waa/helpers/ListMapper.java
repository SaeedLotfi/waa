package com.saeed.waa.helpers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListMapper<T,E> {
    @Autowired
    private ModelMapper mapper;

    public List<?> map(List<T> list, Class<E> convertTo){
        return list
                .stream()
                .map(e -> mapper.map(e, convertTo))
                .collect(Collectors.toList());
    }
}
