(batch "./clips/templates.clp")
(batch "./clips/hechos.clp")


(defrule pelicula_tipo_1
 (Pelicula (name ?name) (genero ?genero) (formato ?formato) (duracion ?duracion) (released_year ?released_year)
    (mood_movie ?mood_movie) (pertenece_tipo ?pertenece_tipo) )
    ;COMPARO QUE LOS DATOS TRAIDOS DE LA INTERFAZ SEAN IGUAL A ESTOS
(test (= ?genero "Acción"))
(test (= ?formato "Tradicional"))
(test (= ?duracion "Larga"))
=>
(assert (tipo_pelicula 1))  ;SETEO EL VALOR DE TIPO PELICULA A 1
;CREO LOS ASSERT DE LAS PELICULAS QUE SON TIPO 1
(assert (name "1917") (genero "Acción") (formato "Tradicional") (duracion "Larga")
 (released_year 2019) (mood_movie "neutral") (pertenece_tipo 1) )
(assert(name "RAMBO") (genero "Acción") (formato "Tradicional") (duracion "Larga")
 (released_year 45) (mood_movie "neutral") (pertenece_tipo 1) )
)

;---------Le asigno los valores a las peliculas y hago el hecho
(defrule convertirPelicula
 (name ?name) (genero ?genero) (formato ?formato) (duracion ?duracion) (released_year ?released_year)
    (mood_movie ?mood_movie) (pertenece_tipo ?pertenece_tipo)
=>
(assert (Pelicula (name ?name) (genero ?genero) (formato ?formato) (duracion ?duracion) (released_year ?released_year)
    (mood_movie ?mood_movie) (pertenece_tipo ?pertenece_tipo) ))
)
;---------Le asigno valores al tipo pelicula
(defrule convertirTipo
(tipo_pelicula ?tipo_pelicula)
=>
(assert (Tipos (tipo_pelicula ?tipo_pelicula)))
)

(defrule mostrar
    (Tipos (tipo_pelicula ?tipo_pelicula))
    (Pelicula (name ?name) (genero ?genero) (formato ?formato) (duracion ?duracion) (released_year ?released_year)
    (mood_movie ?mood_movie) (pertenece_tipo ?pertenece_tipo) )
(test (eq ?tipo_pelicula ?pertenece_tipo))
=>
(printout t "NOMBRE DE LA PELICULA: " ?released_year crlf)
)
