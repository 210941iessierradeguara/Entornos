EJECUTABLE:= prog3.exe

#objetivo: dependencia dependecia2 ... dependenciaN
#tab --> comando

$(EJECUTABLE): libreria1.o libreria2.o ejercicio03.o
	gcc $^ -o $@

libreria1.o: libreria1.c
	ggc -c $^

libreria2.o: libreria2.c
	gcc -c $^

ejercicio03.o: ejercicio03.c
	gcc -c $^

clean:
	rm *.exe