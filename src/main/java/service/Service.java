package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public List<Car> createCar(String model, int series, int maxSpeed) {
        List<Car> carsList = new ArrayList<>();
        Car newCar = new Car(model, series, maxSpeed);
        carsList.add(newCar);
        return carsList;
    }

    public List<Car> createFiveCars(String model1, int series1, int maxSpeed1, String model2, int series2
            , int maxSpeed2, String model3, int series3, int maxSpeed3, String model4, int series4, int maxSpeed4, String model5, int series5, int maxSpeed5) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car(model1, series1, maxSpeed1));
        carsList.add(new Car(model2, series2, maxSpeed2));
        carsList.add(new Car(model3, series3, maxSpeed3));
        carsList.add(new Car(model4, series4, maxSpeed4));
        carsList.add(new Car(model5, series5, maxSpeed5));
        return carsList;
    }
    public List<Car> getOneCar(List<Car> listCars) {
        List<Car> oneCar = new ArrayList<>();
        oneCar.add(listCars.get(0));
        return oneCar;
    }
    public List<Car> getTwoCar(List<Car> listCars) {
        List<Car> cars = new ArrayList<>();
        cars.add(listCars.get(0));
        cars.add(listCars.get(1));
        return cars;
    }
    public List<Car> getThreeCar(List<Car> listCars) {
        List<Car> cars = new ArrayList<>();
        cars.add(listCars.get(0));
        cars.add(listCars.get(1));
        cars.add(listCars.get(2));
        return cars;
    }
    public List<Car> getFourCar(List<Car> listCars) {
        List<Car> cars = new ArrayList<>();
        cars.add(listCars.get(0));
        cars.add(listCars.get(1));
        cars.add(listCars.get(2));
        cars.add(listCars.get(3));
        return cars;
    }
    public List<Car> getAllCar(List<Car> listCars) {
        return listCars;
    }
}
