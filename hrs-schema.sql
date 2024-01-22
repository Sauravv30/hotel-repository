CREATE SCHEMA "hrs-booking";
CREATE SCHEMA "hrs-hotel"; 
CREATE SCHEMA "hrs-users";

CREATE TABLE "hrs-booking".booking_entity (
	booking_date date NULL,
	booking_status int2 NULL,
	check_id_date date NULL,
	check_out_date date NULL,
	id int8 NOT NULL,
	room_id int8 NULL,
	user_id int8 NULL,
	CONSTRAINT booking_entity_booking_status_check CHECK (((booking_status >= 0) AND (booking_status <= 1))),
	CONSTRAINT booking_entity_pkey PRIMARY KEY (id)
);

CREATE TABLE "hrs-hotel".hotel_entity (
	id int8 NOT NULL,
	"location" varchar(255) NULL,
	"name" varchar(255) NULL,
	CONSTRAINT hotel_entity_pkey PRIMARY KEY (id)
);

CREATE TABLE "hrs-hotel".room_entity (
	booked bool NOT NULL,
	room_type int2 NULL,
	hotel_id int8 NOT NULL,
	id int8 NOT NULL,
	"number" varchar(255) NULL,
	CONSTRAINT room_entity_pkey PRIMARY KEY (id),
	CONSTRAINT room_entity_room_type_check CHECK (((room_type >= 0) AND (room_type <= 1))),
	CONSTRAINT fkt0w4t2wslr29ebewyxtnpqkxj FOREIGN KEY (hotel_id) REFERENCES "hrs-hotel".hotel_entity(id)
);

CREATE TABLE "hrs-users".user_entity (
	id int8 NOT NULL,
	email varchar(255) NULL,
	mobile varchar(255) NULL,
	"password" varchar(255) NULL,
	"role" varchar(255) NULL,
	username varchar(255) NULL,
	CONSTRAINT user_entity_pkey PRIMARY KEY (id)
);

INSERT INTO "hrs-booking".booking_entity (booking_date, booking_status, check_id_date, check_out_date, id, room_id, user_id) VALUES('2024-01-20', 0, '2024-01-20', '2024-01-21', 1, 4, 1);
INSERT INTO "hrs-booking".booking_entity (booking_date, booking_status, check_id_date, check_out_date, id, room_id, user_id) VALUES('2024-01-20', 0, '2024-01-20', '2024-01-21', 2, 2, 1);
INSERT INTO "hrs-booking".booking_entity(booking_date, booking_status, check_id_date, check_out_date, id, room_id, user_id) VALUES('2024-01-20', 0, '2024-01-20', '2024-01-21', 3, 5, 1);
INSERT INTO "hrs-booking".booking_entity (booking_date, booking_status, check_id_date, check_out_date, id, room_id, user_id) VALUES('2024-01-20', 0, '2024-01-20', '2024-01-21', 4, 1, 1);
INSERT INTO "hrs-booking".booking_entity (booking_date, booking_status, check_id_date, check_out_date, id, room_id, user_id) VALUES('2024-01-20', 0, '2024-01-20', '2024-01-21', 5, 3, 1);


INSERT INTO "hrs-hotel".hotel_entity (id, "location", "name") VALUES(1, 'Mohali', 'HRS');


INSERT INTO "hrs-hotel".room_entity (booked, room_type, hotel_id, id, "number") VALUES(false, 1, 1, 4, '501');
INSERT INTO "hrs-hotel".room_entity (booked, room_type, hotel_id, id, "number") VALUES(true, 1, 1, 1, '100');
INSERT INTO "hrs-hotel".room_entity (booked, room_type, hotel_id, id, "number") VALUES(true, 1, 1, 3, '801');
INSERT INTO "hrs-hotel".room_entity (booked, room_type, hotel_id, id, "number") VALUES(true, 1, 1, 5, '901');


INSERT INTO "hrs-users".user_entity (id, email, mobile, "password", "role", username) VALUES(1, 'sauravv30@', '988756413', '2312', 'User', 'saurav verma');
INSERT INTO "hrs-users".user_entity (id, email, mobile, "password", "role", username) VALUES(2, 'hrs@mail.com', NULL, 'password', 'User', 'hrs');

