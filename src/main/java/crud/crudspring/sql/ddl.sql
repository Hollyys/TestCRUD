drop table if exsists article CASCADE;
create table article
{
    id bigint generated by default as identity,
    title varchar(255),
    content varchar(500),
    writer varchar(250),
    primary key(id)
};