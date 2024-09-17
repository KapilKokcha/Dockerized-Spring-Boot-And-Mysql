package com.test.dockerFile.repository;

import com.test.dockerFile.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoEntity, Integer> {
}
