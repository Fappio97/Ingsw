//#include "State.h"
#include "Ascensore.h"

int main() {
    srand (time(NULL));

    Ascensore* ascensore = new Ascensore(10);
    ascensore->apriPorta();
    ascensore->allarme();
    ascensore->vaiAlPiano(10);

    delete ascensore;

    return 0;
}