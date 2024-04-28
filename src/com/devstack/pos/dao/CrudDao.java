package com.devstack.pos.dao;

import java.util.*;

public interface CrudDao <T,ID>{
    public void create(T t);
    public T read(ID id);
    public void update(T t);
    public void delete(ID id);
    public List<T> readAll();
}
