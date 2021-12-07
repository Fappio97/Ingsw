#ifndef SECONDOPARAMETRO_H_
#define SECONDOPARAMETRO_H_

#include "ContenitoreCitta.h"

#include <vector>

class SecondoParametro : public ContenitoreCitta {
    public:
        Iteratore* creaIteratore() const;
        void aggiungiElemento(Citta);
        Citta getElemento(int) const;
        int size() const;
    private:
        std::vector<Citta> vettore;
};

#endif