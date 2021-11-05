EJECUTABLE:= prog3.exe
OBJETOS:= libreria1.o libreria2.o ejercicio03.o
SRC:=src
BIN:=bin

#objetivo: dependencia dependecia2 ... dependenciaN 
#tab --> comando

$(EJECUTABLE): $(OBJETOS)
	$(CC) $^ -o $(BIN)/$@

%o: %.c
	$(CC) -c $(SRC)/$^ -I .

clean:
	rm -rf $(BIN)/*.exe *.o hola

hola:
	mkdir hola