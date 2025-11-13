package ByOrkblan.MyAdventure.repository;

import ByOrkblan.MyAdventure.model.Adventure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AdventureRepository extends JpaRepository<Adventure, Long> {
}
