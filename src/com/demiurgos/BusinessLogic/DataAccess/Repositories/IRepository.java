package com.demiurgos.BusinessLogic.DataAccess.Repositories;

import com.demiurgos.BusinessLogic.Entities.Customer;

import java.util.List;

public interface IRepository<T>{
    List<T> Load();
    T GetById(int id);
}
