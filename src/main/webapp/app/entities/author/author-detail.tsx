import React, { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import { Translate } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { useAppDispatch, useAppSelector } from 'app/config/store';

import { getEntity } from './author.reducer';

export const AuthorDetail = () => {
  const dispatch = useAppDispatch();

  const { id } = useParams<'id'>();

  useEffect(() => {
    dispatch(getEntity(id));
  }, []);

  const authorEntity = useAppSelector(state => state.author.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="authorDetailsHeading">
          <Translate contentKey="jhipsterSampleApplicationSqlApp.author.detail.title">Author</Translate>
        </h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">
              <Translate contentKey="global.field.id">ID</Translate>
            </span>
          </dt>
          <dd>{authorEntity.id}</dd>
          <dt>
            <span id="fullName">
              <Translate contentKey="jhipsterSampleApplicationSqlApp.author.fullName">Full Name</Translate>
            </span>
          </dt>
          <dd>{authorEntity.fullName}</dd>
          <dt>
            <span id="birthYear">
              <Translate contentKey="jhipsterSampleApplicationSqlApp.author.birthYear">Birth Year</Translate>
            </span>
          </dt>
          <dd>{authorEntity.birthYear}</dd>
          <dt>
            <span id="deathyear">
              <Translate contentKey="jhipsterSampleApplicationSqlApp.author.deathyear">Deathyear</Translate>
            </span>
          </dt>
          <dd>{authorEntity.deathyear}</dd>
          <dt>
            <span id="birthcountry">
              <Translate contentKey="jhipsterSampleApplicationSqlApp.author.birthcountry">Birthcountry</Translate>
            </span>
          </dt>
          <dd>{authorEntity.birthcountry}</dd>
        </dl>
        <Button tag={Link} to="/author" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.back">Back</Translate>
          </span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/author/${authorEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.edit">Edit</Translate>
          </span>
        </Button>
      </Col>
    </Row>
  );
};

export default AuthorDetail;
