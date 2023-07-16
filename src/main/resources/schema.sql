CREATE TABLE IF NOT EXISTS public.Workers (
	id serial PRIMARY KEY,
	name varchar(255) UNIQUE NOT NULL,
	position varchar(255) NOT NULL,
	avatar bytea NULL
);

CREATE TABLE IF NOT EXISTS public.Tasks (
	id serial PRIMARY KEY,
	title varchar(255) UNIQUE NOT NULL,
	description varchar(255) NULL,
	time time NOT NULL,
	status varchar(255) NOT NULL,
	performer int NULL,
	CONSTRAINT fk_tasks_workers FOREIGN KEY (performer) REFERENCES public.Workers(id)
);
