package vn.fs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.fs.entities.Favorite;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long>{

}
