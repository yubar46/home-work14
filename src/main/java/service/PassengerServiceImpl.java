package service;

import domain.Passenger;
import repository.BaseRepository;
import repository.PassengerRepository;
import repository.PassengerRepositoryImpl;

public class PassengerServiceImpl extends BaseServiceImpl<Passenger,Integer, PassengerRepository> implements PassengerService {
  public PassengerServiceImpl(PassengerRepository repository) {
    super(repository);
  }
}
