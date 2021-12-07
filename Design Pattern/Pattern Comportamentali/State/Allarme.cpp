#include "Allarme.h"

void Allarme::operazione() {

    if(ascensore->getPersoneAttuali() == 0)
        std::cout << "Non puoi premere tasti se non c'è nessuno dentro\n";
        
    else {
        std::cout << "Stanno arrivando i soccorsi" << '\n';
        sleep((rand() % 4 + 2) * 2);
        std::cout << "Soccorsi arrivati" << '\n';

        std::cout << "Agiscono i soccorsi ed il ripristino dell'ascensore" << '\n';
        sleep((rand() % 5 + 2) * 3);
        std::cout << "Ascensore ripristinato" << '\n';
        ascensore->setVolteAllarme(ascensore->getVolteAllarme() + 1);
        
        if(ascensore->getVolteAllarme() > 2)
            std::cout << "Si è già bloccato " << ascensore->getVolteAllarme() << ", non sembra un ascensore sicuro\n";

        std::cout << "\n";
    }
}