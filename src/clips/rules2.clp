(batch "./clips/templates2.clp")
(import clases.*)
(deftemplate Tipos (declare (from-class Tipos)))
(deftemplate Pelicula (declare (from-class Pelicula)))
(deftemplate User (declare (from-class User)))
(load-facts "./clips/hechos.dat")


(defrule compararGenero
(Pelicula (name ?name) (genero ?genero) (formato ?formato) (duracion ?duracion) (released_year ?released_year)
    (mood_movie ?mood_movie) (pertenece_tipo ?pertenece_tipo) )
(Tipos (tipo_genero ?tipo_genero) (tipo_formato ?tipo_formato) (tipo_duracion ?tipo_duracion) (tipo_mood ?tipo_mood))
(User (user ?user))
(test (and(eq ?tipo_genero ?genero)
     (eq ?tipo_formato ?formato)
     (eq ?tipo_duracion ?duracion) ))
=>
(assert (Respuesta (user ?user) (movie_name ?name) (genero ?genero)
    (duracion ?duracion) (mood ?mood_movie) (movie_year ?released_year)))
)

(defrule compararMood
(Tipos (tipo_genero ?tipo_genero) (tipo_formato ?tipo_formato) (tipo_duracion ?tipo_duracion) (tipo_mood ?tipo_mood))
(User (user ?user))
(Pelicula (name ?name) (genero ?genero) (formato ?formato) (duracion ?duracion) (released_year ?released_year)
    (mood_movie ?mood_movie) (pertenece_tipo ?pertenece_tipo) )
(test (and (= ?tipo_mood ?mood_movie) (= ?tipo_formato ?formato)))
=>
(assert (Respuesta (user ?user) (movie_name ?name) (genero ?genero)
    (duracion ?duracion) (mood ?tipo_mood) (movie_year ?released_year)))
)

(defrule showResult
(Respuesta (user ?user) (movie_name ?movie_name) (genero ?genero) (duracion ?duracion)
    (mood ?mood) (movie_year ?movie_year))
=>
(printout t "---PELICULA: " ?movie_name crlf "-GENERO: " ?genero crlf)
(printout t "-DURACION: " ?duracion crlf "-AÑO DE ESTRENO: " ?movie_year crlf "-ESTADO DE ANIMO: " ?mood crlf)
)

(defrule no-data
(Pelicula (name ?name) (genero ?genero) (formato ?formato) (duracion ?duracion) (released_year ?released_year)
    (mood_movie ?mood_movie) (pertenece_tipo ?pertenece_tipo) )
(Tipos (tipo_genero ?tipo_genero) (tipo_formato ?tipo_formato) (tipo_duracion ?tipo_duracion) (tipo_mood ?tipo_mood))
(User (user ?user))
(test (not(eq ?tipo_genero ?genero)))
(test(not(eq ?tipo_formato ?formato)))
(test(not(eq ?tipo_duracion ?duracion)))
=>
(printout t "No se han encontrado peliculas")
)
