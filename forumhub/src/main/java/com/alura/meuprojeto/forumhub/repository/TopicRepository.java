package com.alura.meuprojeto.forumhub.repository;

import com.alura.meuprojeto.forumhub.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
