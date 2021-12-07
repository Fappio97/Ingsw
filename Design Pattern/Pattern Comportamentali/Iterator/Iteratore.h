#ifndef ITERATORE_H_
#define ITERATORE_H_

#include "Citta.h"

class Iteratore {
    public:
        virtual void primoElemento() = 0;
        virtual void prossimoElemento() = 0;
        virtual bool fine() const = 0;
        virtual Citta attualeElemento() const = 0;
};

#endif