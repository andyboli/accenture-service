package accenture.server.service;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface ServiceInterface<T, I extends Serializable> {

  EntityManagerFactory emf =
      Persistence.createEntityManagerFactory("accenture.server.hibernat");

  void save(T s);

  void update(T s);

  void delete(I id);

  List<T> list();

  T findById(I id);
}