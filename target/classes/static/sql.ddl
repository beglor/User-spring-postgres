CREATE TABLE IF NOT EXISTS public.users
(
    id integer NOT NULL,
    name text COLLATE pg_catalog."default",
    surname text COLLATE pg_catalog."default",
    CONSTRAINT users_pkey PRIMARY KEY (id)
);

INSERT INTO public.users(id,name,surname) values (default,'Петр','Петров');
INSERT INTO public.users(id,name,surname) values (default,'Петр1','Петров1');
INSERT INTO public.users(id,name,surname) values (default,'Петр2','Петров2');
INSERT INTO public.users(id,name,surname) values (default,'Петр3','Петров3');
INSERT INTO public.users(id,name,surname) values (default,'Петр4','Петров4');
INSERT INTO public.users(id,name,surname) values (default,'Петр5','Петров5');
INSERT INTO public.users(id,name,surname) values (default,'Петр6','Петров6');
INSERT INTO public.users(id,name,surname) values (default,'Петр7','Петров7');
INSERT INTO public.users(id,name,surname) values (default,'Петр8','Петров8');
INSERT INTO public.users(id,name,surname) values (default,'Петр8','Петров8');
INSERT INTO public.users(id,name,surname) values (default,'Петр9','Петров9');
INSERT INTO public.users(id,name,surname) values (default,'Петр10','Петров10');
