(deffunction buscarTipo (?genero ?formato ?duracion)
(if (and (eq ?genero Acción)
            (eq ?formato Tradicional)
            (eq ?duracion Larga)) 
    then (printout t "Pelicula tipo 1" crlf) (return 1)
else (printout t "No existe" crlf) (return 0))
)

