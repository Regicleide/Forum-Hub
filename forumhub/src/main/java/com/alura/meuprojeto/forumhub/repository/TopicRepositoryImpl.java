package com.alura.meuprojeto.forumhub.repository;

import com.alura.meuprojeto.forumhub.model.Topic;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public final class TopicRepositoryImpl implements TopicRepository {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Topic> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Topic> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Topic> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Topic getOne(Long aLong) {
        return null;
    }

    @Override
    public Topic getById(Long aLong) {
        return null;
    }

    @Override
    public Topic getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Topic> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Topic> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Topic> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Topic> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Topic> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Topic> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Topic, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Topic> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Topic> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Topic> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Topic> findAll() {
        return List.of();
    }

    @Override
    public List<Topic> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Topic entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Topic> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Topic> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Topic> findAll(Pageable pageable) {
        return null;
    }
}
