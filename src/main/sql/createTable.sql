create table geek (
id int,
nom varchar(30),
prenom varchar(30),
mail varchar(30),
sexe varchar(1),
photo varchar(30),
description_courte varchar(100),
description_longue varchar(300),
constraint pk_geek primary key (id)
);

create table interet (
id int,
libelle varchar(30),
photo varchar(30),
constraint pk_interet primary key (id)
);

create table geekinteret (
id_geek int,
id_interet int,
constraint pk_geekinteret primary key (id_geek, id_interet)
);

create table audit (
heure varchar(30),
ip varchar(20),
id_geek int,
constraint pk_audit primary key (heure)
);

alter table geekinteret
	add constraint fk_geek_geekinteret foreign key (id_geek) references geek (id);

alter table geekinteret
	add constraint fk_interet_geekinteret foreign key (id_interet) references interet (id);

	alter table audit
	add constraint fk_audit_geek foreign key (id_geek) references geek (id);