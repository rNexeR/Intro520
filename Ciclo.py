x = 1
while(x <= 10):
	print x
	x+=1

for n in range(1, 11):
	print n

while(1):
	print "Menu Principal"
	print "1- Suma \n" + "2- Resta\n"+"3- Multiplicacion\n" + "4- Division\n" + "5- Salir"
	opcion = input("Ingrese una opcion: ")

	if(opcion == 1):
		print "Sumando"
	elif (opcion == 2):
		print "Restando"
		continue
	elif (opcion == 5):
		print "Saliendo"
		break

	print "Termina una iteracion"


Un numero que detecte si un numero es primo o no 