EJECUTABLE:= prog3.exe
FUENTES:= *.c
OBJETOS:= libreria1.o libreria2.o ejercicio03.o

#objetivo: dependencia dependecia2 ... dependenciaN
#tab --> comando

$(EJECUTABLE): $(OBJETOS)
	$(CC) $^ -o $@

%o: %.c
	$(CC) -c $^

clean:
	rm *.exe *.o