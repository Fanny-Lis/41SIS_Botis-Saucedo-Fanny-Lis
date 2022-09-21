Algoritmo sin_titulo
	definir a, b, c como entero;
	definir op como entero;
	

	escribir "1.Para calcular el nùmero mayor y 2.Para calcular el nùmero menor"
	leer op;
	


	
	segun op hacer
		caso 1:
			
				escribir "Dame el valor de a";
				leer a;
				escribir "Dame el valor de b";
				leer b;
				escribir "Dame el valor de c";
				leer c;
				
			
			
			si (a>b) y (a>c) Entonces
				escribir "El nùmero mayor es a";
				si (b>a) y (b>c) Entonces
					escribir "El nùmero mayor es b";
					si (c>a) y (c>b) Entonces
						escribir "El nùmero mayor es c";
					FinSi
				FinSi
			FinSi
			si (a=b) o (b=c) o (a=c) Entonces
				escribir "Debe ingresar numeros diferentes, vuelva intentarlo"
			FinSi
			
	caso 2:
		
		escribir "Dame el valor de a";
		leer a;
		escribir "Dame el valor de b";
		leer b;
		escribir "Dame el valor de c";
		leer c;
		
		
		
		si (a<b) y (a<c) Entonces
			escribir "El nùmero menor es a";
			si (b<a) y (b<c) Entonces
				escribir "El nùmero menor es b";
				si (c<a) y (c<b) Entonces
					escribir "El nùmero menor es c";
				FinSi
			FinSi
		FinSi
		si (a=b) o (b=c) o (a=c) Entonces
			escribir "Debe ingresar numeros diferentes, vuelva intentarlo"
		FinSi
		
	
FinSegun

		
FinAlgoritmo

		

		
				

			
			
			
	

