package ng.demos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloJpaRepository extends JpaRepository<HelloEntity, Long> {
}
