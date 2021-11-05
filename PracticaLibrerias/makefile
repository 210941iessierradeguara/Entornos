EJECUTABLE:= programaGeometria.exe
OBJETOS:= areas.o volumenes.o main.o
SRC:=src
BIN:=bin

$(EJECUTABLE): $(OBJETOS)
	$(CC) $^ -o $(BIN)/$@

%o: %.c
	$(CC) -c $(SRC)/$^ -I .

clean:
	rm -rf $(BIN)/*.exe *.o

bin:
	mkdir bin