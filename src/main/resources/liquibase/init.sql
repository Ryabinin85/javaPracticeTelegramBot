--liquibase formatted sql
--changeset Ryabinin:1

CREATE TABLE notification_task
(
    id        bigint generated by default as identity primary key,
    message   TEXT      NOT NULL,
    chat_id   BIGINT    NOT NULL,
    date_time TIMESTAMP NOT NULL
);