package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", "Granta", 2024));
        cars.add(new Car("Datsun", "On-Do",2022));
        cars.add(new Car("Renault", "Logan", 2023));
        cars.add(new Car("Nissan", "Almera",2022));
        cars.add(new Car("Kia", "Rio",2021));
    }

    public List<Car> getCars(int numberOfCars) {
        if (numberOfCars > cars.size()) {
            return new ArrayList<>(cars);
        }
        return cars.subList(0,numberOfCars);
    }
}
