package ecom.boy.repository;

import ecom.boy.model.persistence.ECBUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ecom.boy.model.ECBUserdto;

import java.util.List;
import java.util.Map;

@Repository
public interface ModifyRepository extends JpaRepository<ECBUserdto, Integer> {
}