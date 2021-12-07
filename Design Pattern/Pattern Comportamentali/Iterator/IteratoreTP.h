#ifndef ITERATORETP_H_
#define ITERATORETP_H_

#include "Iteratore.h"
#include "TerzoParametro.h"

class IteratoreTP : public Iteratore {
    public:
        IteratoreTP(const TerzoParametro*);
        void primoElemento();
        void prossimoElemento();
        bool fine() const;
        Citta attualeElemento() const;
    private:
        int indice;
        const TerzoParametro* v;
};

#endif