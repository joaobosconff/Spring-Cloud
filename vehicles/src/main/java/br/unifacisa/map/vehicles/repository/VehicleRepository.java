package br.unifacisa.map.vehicles.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.unifacisa.map.vehicles.model.Vehicle;


@RepositoryRestResource(collectionResourceRel = "vehicles", path = "vehicles")
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, Integer>{

}
