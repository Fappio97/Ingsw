#include "ApriPorta.h"

void ApriPorta::operazione() {
    
    int personeSalgono = rand() % 10 + 0;

    if(ascensore->getPersoneAttuali() != 0) {
        int personeScendono = rand() % ascensore->getPersoneAttuali() + 0;

        if(personeScendono != 0) {
            // ogni persona impiega 200 millisecondi per scendere
            std::cout << "Stanno scendendo " << personeSalgono << " persone" << '\n';
            sleep(personeScendono * 0.2);
            ascensore->setPersoneAttuali(ascensore->getPersoneAttuali() - personeScendono);
            std::cout << "Persone scese!" << '\n';
        }
    }

    if(personeSalgono != 0) {
        personeSalgono = personeSalgono + ascensore->getPersoneAttuali() > ascensore->getPersoneMax() ? ascensore->getPersoneMax() : personeSalgono + ascensore->getPersoneAttuali();
        
        // ogni persona impiega 200 millisecondi per salire
        std::cout << "Stanno salendo " << personeSalgono << " persone" << '\n';
        sleep(personeSalgono * 0.2);
        ascensore->setPersoneAttuali(personeSalgono);
        std::cout << "Persone salite!" << '\n';
    }

    std::cout << "\n";
}