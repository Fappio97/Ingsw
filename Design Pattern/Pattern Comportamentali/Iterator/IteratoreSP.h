#ifndef ITERATORESP_H_
#define ITERATORESP_H_

#include "Iteratore.h"
#include "SecondoParametro.h"

class IteratoreSP : public Iteratore {
    public:
        IteratoreSP(const SecondoParametro*);
        void primoElemento();
        void prossimoElemento();
        bool fine() const;
        Citta attualeElemento() const;
    private:
        int indice;
        const SecondoParametro* v;
};

#endif