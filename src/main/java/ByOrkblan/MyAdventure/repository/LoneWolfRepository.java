package ByOrkblan.MyAdventure.repository;

import ByOrkblan.MyAdventure.model.LoneWolf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoneWolfRepository extends JpaRepository<LoneWolf, Integer> {
}
