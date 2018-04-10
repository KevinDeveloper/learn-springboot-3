package com.kevin.lessontwo.testLoggerInsertDB.JPA;

import com.kevin.lessontwo.testLoggerInsertDB.entity.LoggerInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface LoggerJPA  extends JpaRepository<LoggerInfoEntity, Long>, JpaSpecificationExecutor<LoggerInfoEntity>,
        Serializable {


}
