#ifndef TERZOPARAMETRO_H_
#define TERZOPARAMETRO_H_

#include "ContenitoreCitta.h"

#include <vector>

class TerzoParametro : public ContenitoreCitta {
    public:
        Iteratore* creaIteratore() const;
        void aggiungiElemento(Citta);
        Citta getElemento(int) const;
        int size() const;
    private:
        std::vector<Citta> vettore;
};

#endif