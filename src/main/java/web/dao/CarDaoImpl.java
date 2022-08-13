package web.dao;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Cars> carsList;

    public CarDaoImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Cars("Audi", "A7", "A000AA178"));
        carsList.add(new Cars("BMW", "3", "A001AA178"));
        carsList.add(new Cars("Lada", "Vesta", "A003AA178"));
    }


    @Override
    public void addCar(Cars car) {

        carsList.add(car);
    }

    @Override
    public List<Cars> getCarsListByCount(int count) {
        if (count == 0 || count > carsList.size()) {
            return carsList;
        } else {
            List<Cars> newList = new ArrayList<>();
            newList = carsList.stream()
                    .limit(count)
                    .toList();
            return newList;
        }
    }

    public List<Cars> getAllCars() {
        return carsList;
    }
}
