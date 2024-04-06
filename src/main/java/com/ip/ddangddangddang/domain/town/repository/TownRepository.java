package com.ip.ddangddangddang.domain.town.repository;

import com.ip.ddangddangddang.domain.town.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends JpaRepository<Town, Long> {

}
