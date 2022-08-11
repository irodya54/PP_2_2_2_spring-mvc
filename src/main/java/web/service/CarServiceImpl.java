package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Cars;
public class CarServiceImpl implements CarService{
    private CarDao carDao;
    @Override
    public void addCars(Cars car) {
        carDao.addCar(car);
    }
}
