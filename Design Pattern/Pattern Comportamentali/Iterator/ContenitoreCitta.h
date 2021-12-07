#ifndef CONTENITORECITTA_H_
#define CONTENITORECITTA_H_

#include "Citta.h"
#include "Iteratore.h"

class ContenitoreCitta {
    public:
        virtual Iteratore* creaIteratore() const = 0;
        virtual void aggiungiElemento(Citta) = 0;
        virtual Citta getElemento(int) const = 0;
        virtual int size() const = 0;
};

#endif