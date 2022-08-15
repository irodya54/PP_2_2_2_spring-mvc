package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public void addCar(Cars car) {
        carDao.addCar(car);
    }

    @Override
    public List<Cars> getCarsListByCount(int count) {
        return carDao.getCarsListByCount(count);
    }
}
