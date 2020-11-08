(batch "./clips/templates2.clp")
(import clases.*)
(deftemplate Tipos (declare (from-class Tipos)))
(deftemplate Pelicula (declare (from-class Pelicula)))
(deftemplate User (declare (from-class User)))
(load-facts "./clips/hechos.dat")


(defrule comparar
(Tipos (tipo_genero ?tipo_genero) (tipo_formato ?tipo_formato) (tipo_duracion ?tipo_duracion) (tipo_mood ?tipo_mood))
(User (user ?user))
(Pelicula (name ?name) (genero ?genero) (formato ?formato) (duracion ?duracion) (released_year ?released_year)
    (mood_movie ?mood_movie) (pertenece_tipo ?pertenece_tipo) )
(test (and (= ?tipo_genero ?genero) (= ?tipo_formato ?formato) (= ?tipo_duracion ?duracion)))
=>
;(printout t "-------------------------------PELICULA ENCONTADA----------------------------" crlf
;"Pelicula: " ?name crlf "Genero: " ?genero crlf "Formato: " ?formato crlf "duracion: " ?duracion crlf "=======================" crlf)
(assert (Respuesta (user ?user) (movie_name ?name) (genero ?genero)
    (duracion ?duracion) (mood ?tipo_mood) (fecha "FECHA")))
)

(defrule showResult
(Respuesta (user ?user) (movie_name ?movie_name) (genero ?genero) (duracion ?duracion)
    (mood ?mood) (fecha ?fecha))
=>
(printout t "***********************************HOLA****************************" crlf)
(printout t "Pelicula para el usuario: " ?user crlf "PELICULA: " ?movie_name crlf "GENERO: " ?genero crlf)
(assert (moviesResult ?user) (moviesResult ?movie_name))
)

