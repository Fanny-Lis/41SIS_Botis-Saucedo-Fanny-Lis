Algoritmo sin_titulo
repetir
	escribir "Ingrese 1 para calcular área de un cilindro y 2 para calcular el volumen"
	leer op


	

segun op Hacer
	
		caso 1:
			escribir "Ingrese el valor del radio"
			leer r
			escribir "Ingrese el valor de la altura"
			leer h
			area=2*3.1416*r+(r+h)
			escribir "El área del cilindro es de:", area
			
			Escribir "Ingrese 2 para regresar al menú"
			leer op2
		
		
		caso 2:
			escribir "Ingrese el valor del radio"
			leer r
			escribir "Ingrese el valor de la altura"
			leer h
			volumen=(3.1416*(r*r))*h
			escribir "El volumen del cilindro es de:", volumen
			
		
			
	FinSegun
Hasta Que op=2

FinAlgoritmo
