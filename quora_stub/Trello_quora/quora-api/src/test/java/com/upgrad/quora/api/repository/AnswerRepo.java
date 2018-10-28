package com.upgrad.quora.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upgrad.quora.api.entity.Answer;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Integer> {

	Answer findByQuestionId(Integer questionId);
}
