(deftemplate Usuario
(slot user)
(slot edad)
(slot mood_user) )

(deftemplate Pelicula
(slot name)
(multislot genero)
(slot formato)
(slot duracion)
(slot released_year)
(slot mood_movie)
(slot pertenece_tipo))

(deftemplate Tipos
(slot tipo_pelicula)
(slot tipo_genero)
(slot tipo_formato)
(slot tipo_duracion)
(slot tipo_mood))

(deftemplate Respuesta
(slot user)
(slot movie-name)
(slot genero)
(slot duración)
(slot mood)
(slot fecha) )