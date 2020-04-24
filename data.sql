create table events (

eventId int primary key,
eventName varchar(30) not null,
eventLocation varchar(30) not null,
eventDate date not null,
eventHour int2 not null check (eventHour < 13), check (eventHour > -1),
eventMinute int2 not null check (eventMinute < 61), check (eventMinute >-1),
afternoon boolean not null
);

insert into events values ('0', 'Davids Birthday', 'Davids House', '12/30/2020', 12, 30, true);



select * from events;
