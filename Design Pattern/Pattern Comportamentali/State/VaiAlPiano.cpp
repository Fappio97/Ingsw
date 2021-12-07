#include "VaiAlPiano.h"

#include <cmath>

void VaiAlPiano::operazione() {

    if(ascensore->getPianoDaRaggiungere() == ascensore->getPianoAttuale()) 
        std::cout << "Sei già al piano selezionato\n";
    else {
        std::cout << "L'ascensore sta andando dal piano " << ascensore->getPianoAttuale() 
                << " al piano " << ascensore->getPianoDaRaggiungere() << "\n";
        sleep(abs(ascensore->getPianoDaRaggiungere() - ascensore->getPianoAttuale()) * 1);
        std::cout << "Piano raggiunto!" << '\n';

        ascensore->setPianoAttuale(ascensore->getPianoDaRaggiungere());
    }
    std::cout << "\n";
}