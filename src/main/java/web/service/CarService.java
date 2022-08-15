package web.service;

import web.model.Cars;

import java.util.List;

public interface CarService {
    public void addCar(Cars cars);
    List<Cars> getCarsListByCount(int count);
}
