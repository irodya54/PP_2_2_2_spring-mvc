package web.service;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Cars> carsList;

    @Override
    public void addCar(Cars car) {
        if (carsList.isEmpty()) {
            carsList = new ArrayList<>();
        }
        carsList.add(car);
    }
}
