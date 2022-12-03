-- SQL script to create table used in the project

drop table if exists televisions;

create table televisions (
                             id serial primary key,
                             model text not null,
                             producer text not null,
                             production_country text,
                             width integer not null,
                             height integer not null,
                             sold boolean not null default false,
                             constraint positive_width_and_height check (width > 0 and height > 0)
);