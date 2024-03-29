import React, { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import { Translate } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { useAppDispatch, useAppSelector } from 'app/config/store';

import { getEntity } from './genre.reducer';

export const GenreDetail = () => {
  const dispatch = useAppDispatch();

  const { id } = useParams<'id'>();

  useEffect(() => {
    dispatch(getEntity(id));
  }, []);

  const genreEntity = useAppSelector(state => state.genre.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="genreDetailsHeading">
          <Translate contentKey="jhipsterSampleApplicationSqlApp.genre.detail.title">Genre</Translate>
        </h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">
              <Translate contentKey="global.field.id">ID</Translate>
            </span>
          </dt>
          <dd>{genreEntity.id}</dd>
          <dt>
            <span id="title">
              <Translate contentKey="jhipsterSampleApplicationSqlApp.genre.title">Title</Translate>
            </span>
          </dt>
          <dd>{genreEntity.title}</dd>
          <dt>
            <span id="decription">
              <Translate contentKey="jhipsterSampleApplicationSqlApp.genre.decription">Decription</Translate>
            </span>
          </dt>
          <dd>{genreEntity.decription}</dd>
        </dl>
        <Button tag={Link} to="/genre" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.back">Back</Translate>
          </span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/genre/${genreEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.edit">Edit</Translate>
          </span>
        </Button>
      </Col>
    </Row>
  );
};

export default GenreDetail;
