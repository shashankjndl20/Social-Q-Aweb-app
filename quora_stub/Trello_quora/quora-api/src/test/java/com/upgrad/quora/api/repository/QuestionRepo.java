package com.upgrad.quora.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upgrad.quora.api.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{

	List<Question> findByUserId(Integer userId);
}
