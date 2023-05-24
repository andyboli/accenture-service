package accenture.server.service;

import accenture.server.hibernate.entity.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CompanyService implements ServiceInterface<Company, Long> {
  private EntityManagerFactory emf;

  public CompanyService() {
    super();
    this.emf = ServiceInterface.emf;
  }

  @Override
  public void save(Company company) {
    EntityManager em = this.emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(Company);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void update(Company company) {
    EntityManager em = this.emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(Company);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = this.emf.createEntityManager();
    Company toBeDeleted = em.find(Company.class, id);
    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Company> list() {
    EntityManager em = this.emf.createEntityManager();
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Company> cq = cb.createQuery(Company.class);
    Root<Company> rootEntry = cq.from(Company.class);
    CriteriaQuery<Company> all = cq.select(rootEntry);
    TypedQuery<Company> allQuery = em.createQuery(all);
    return allQuery.getResultList();
  }

  @Override
  public Company findById(Long id) {
    EntityManager em = this.emf.createEntityManager();
    return em.find(Company.class, id);
  }
}
