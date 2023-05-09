package team6.car.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team6.car.device.domain.Device;
import team6.car.vehicle.domain.Near_Vehicle;
import team6.car.vehicle.domain.Vehicle;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {


    Vehicle save(Vehicle vehicle); // 본인 차량 저장
    Optional<Vehicle> findById(Long id);
    List<Vehicle> findAll();

}
