-------------------------------------------------------- Table: public.arbitro --------------------------------------------------------

-- DROP TABLE IF EXISTS public.arbitro;

CREATE TABLE IF NOT EXISTS public.arbitro
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    nome text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT pk_arbitro PRIMARY KEY (id)
)

TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.arbitro
    OWNER to databrasileirao;


-------------------------------------------------------- Table: public.estados --------------------------------------------------------

-- DROP TABLE IF EXISTS public.estados;

CREATE TABLE IF NOT EXISTS public.estados
(
    id integer NOT NULL,
    sigla text COLLATE pg_catalog."default" NOT NULL,
    nome text COLLATE pg_catalog."default" NOT NULL,
    macroregiao text COLLATE pg_catalog."default" NOT NULL,
    bandeira text COLLATE pg_catalog."default",
    CONSTRAINT estados_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.estados
    OWNER to databrasileirao;


-------------------------------------------------------- Table: public.cidades --------------------------------------------------------

-- DROP TABLE IF EXISTS public.cidades;

CREATE TABLE IF NOT EXISTS public.cidades
(
    id integer NOT NULL,
    id_uf integer NOT NULL,
    nome text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT cidades_pkey PRIMARY KEY (id),
    CONSTRAINT pk_uf FOREIGN KEY (id_uf)
        REFERENCES public.estados (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cidades
    OWNER to databrasileirao;



-------------------------------------------------------- Table: public.estadio --------------------------------------------------------

-- DROP TABLE IF EXISTS public.estadio;

CREATE TABLE IF NOT EXISTS public.estadio
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    nome text COLLATE pg_catalog."default" NOT NULL,
    apelido text COLLATE pg_catalog."default",
    id_cidade integer,
    CONSTRAINT estadio_pkey PRIMARY KEY (id),
    CONSTRAINT pk_cidade FOREIGN KEY (id_cidade)
        REFERENCES public.cidades (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.estadio
    OWNER to databrasileirao;


-------------------------------------------------------- Table: public.treinador --------------------------------------------------------

-- DROP TABLE IF EXISTS public.treinador;

CREATE TABLE IF NOT EXISTS public.treinador
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    nome text COLLATE pg_catalog."default" NOT NULL,
    foto text COLLATE pg_catalog."default",
    CONSTRAINT treinador_pkey PRIMARY KEY (id, nome)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.treinador
    OWNER to databrasileirao;


--------------------------------------------------------  Table: public.clube -------------------------------------------------------- 

-- DROP TABLE IF EXISTS public.clube

CREATE TABLE IF NOT EXISTS public.clube
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    nome text COLLATE pg_catalog."default" NOT NULL,
    nome_completo text COLLATE pg_catalog."default",
    data_fundacao date NOT NULL,
    historia text COLLATE pg_catalog."default",
    distintivo text COLLATE pg_catalog."default",
    id_cidade integer NOT NULL,
    CONSTRAINT clube_pkey PRIMARY KEY (id),
    CONSTRAINT pk_cidade FOREIGN KEY (id_cidade)
        REFERENCES public.cidades (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.clube
    OWNER to databrasileirao;


-------------------------------------------------------- Table: public.campeonato --------------------------------------------------------

-- DROP TABLE IF EXISTS public.campeonato;

CREATE TABLE IF NOT EXISTS public.campeonato
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    ano integer NOT NULL,
    data_inicio date,
    data_fim date,
    campeao integer,
    vicecampeao integer,
    resumo text COLLATE pg_catalog."default",
    CONSTRAINT campeonato_pkey PRIMARY KEY (id),
    CONSTRAINT pk_campeao FOREIGN KEY (campeao)
        REFERENCES public.clube (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT pk_vice FOREIGN KEY (vicecampeao)
        REFERENCES public.clube (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.campeonato
    OWNER to databrasileirao;