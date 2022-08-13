package web.dao;

import web.model.Cars;

import java.util.List;

public interface CarDao {
    public void addCar(Cars car);
    public List<Cars> getCarsListByCount(int count);
}
