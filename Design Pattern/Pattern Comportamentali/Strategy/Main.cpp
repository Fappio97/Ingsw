#include "Campo.h"
#include "ServeAndVolley.h"
#include "Difensiva.h"
#include "Attaccante.h"

int main() {
    srand (time(NULL));

    Campo* campo = new Campo("Roma", "Djokovic", "Roddick");
    campo->cambiaStrategia(0, new ServeAndVolley());
    campo->cambiaStrategia(1, new Difensiva());

    campo->gioca();

    delete campo;

return 0;
}