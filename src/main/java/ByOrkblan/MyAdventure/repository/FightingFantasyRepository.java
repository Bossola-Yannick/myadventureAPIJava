package ByOrkblan.MyAdventure.repository;

import ByOrkblan.MyAdventure.model.FightingFantasy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FightingFantasyRepository extends JpaRepository<FightingFantasy, Integer> {
}
